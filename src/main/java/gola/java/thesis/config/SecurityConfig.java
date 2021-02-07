package gola.java.thesis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("student")
                .password("student1")
                .roles("STUDENT")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("wykladowca")
                .password("wykladowca1")
                .roles("WYKLADOWCA")
                .build();

        UserDetails moderator = User.withDefaultPasswordEncoder()
                .username("moderator")
                .password("moderator1")
                .roles("MODERATOR")
                .build();

        return new InMemoryUserDetailsManager(user, admin, moderator);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Dostęp do pola testowego
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/test").hasRole("STUDENT")
                .antMatchers("/test2").hasRole("WYKLADOWCA")
                .antMatchers("/test3").hasRole("MODERATOR")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable(); // wylaczanie csrf, aby móc korzystac z zewnetrznych aplikacji jak postman

        // Dostęp do Exercise
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/exercise").permitAll()
                .antMatchers(HttpMethod.POST, "/exercise").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .antMatchers(HttpMethod.DELETE, "/exercise").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

        // Dostęp do Classes
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/classes").permitAll()
                .antMatchers(HttpMethod.DELETE, "/classes").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .antMatchers(HttpMethod.POST, "/classes").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

        // Dostęp do Note
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/notes").permitAll()
                .antMatchers(HttpMethod.GET, "/notes/{id}").permitAll()
                .antMatchers(HttpMethod.PUT, "/notes").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .antMatchers(HttpMethod.PUT, "/notes/{id}").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .antMatchers(HttpMethod.POST, "/notes").hasAnyRole("MODERATOR", "WYKLADOWCA")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

        // Dostęp do Task
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/tasks").permitAll()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

        // Dostep do Student
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/students").permitAll()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();
    }

}

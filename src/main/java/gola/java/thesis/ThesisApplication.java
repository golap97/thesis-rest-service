package gola.java.thesis;

import gola.java.thesis.config.TaskConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@EnableConfigurationProperties(TaskConfiguration.class)
@SpringBootApplication
public class ThesisApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ThesisApplication.class, args);


	}

}



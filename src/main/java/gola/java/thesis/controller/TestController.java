package gola.java.thesis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String sayHello() { return "Witaj studencie"; }

    @GetMapping("/test2")
    public String sayHello2() {
        return "Witaj wykladowco";
    }

    @GetMapping("/test3")
    public String sayHello3() {
        return "Witaj moderatorze";
    }

}

package gola.java.thesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String error404() {
        return "404";
    }

    @RequestMapping(value = "/401", method = RequestMethod.GET)
    public String errror401() {
        return "401";
    }

}

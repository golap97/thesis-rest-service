package gola.java.thesis.controller;

import gola.java.thesis.config.TaskConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {
    final private DataSourceProperties dataSource;
    final private TaskConfiguration myProp;

    public InfoController(DataSourceProperties dataSource, TaskConfiguration myProp) {
        this.dataSource = dataSource;
        this.myProp = myProp;
    }

    @GetMapping("/info/url")
    String url() {
        return dataSource.getUrl();
    }

    @GetMapping("/info/prop")
    boolean myProp() {
        return myProp.isAllowMultipleTasksFromTemplate();
    }
}

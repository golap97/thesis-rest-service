package gola.java.thesis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("task")
public class TaskConfiguration {
    private boolean allowMultipleTasksFromTemplate;

    public boolean isAllowMultipleTasksFromTemplate() {
        return allowMultipleTasksFromTemplate;
    }

    public void setAllowMultipleTasksFromTemplate(boolean allowMultipleTasksFromTemplate) {
        this.allowMultipleTasksFromTemplate = allowMultipleTasksFromTemplate;
    }

}

package ru.vital.eventlistenerdemo;

import org.springframework.context.ApplicationEvent;

public class MySpringEvent extends ApplicationEvent {

    private String message;

    public MySpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

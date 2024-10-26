package dev.vitaliy.eventlistenerdemo.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class MySpringEvent extends ApplicationEvent {

    private final String message;

    public MySpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}

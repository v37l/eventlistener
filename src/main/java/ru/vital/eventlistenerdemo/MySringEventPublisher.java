package ru.vital.eventlistenerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MySringEventPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(final String message) {
        System.out.println("publishing my event");
        MySpringEvent mySpringEvent = new MySpringEvent(this, message);
        eventPublisher.publishEvent(mySpringEvent);
    }
}

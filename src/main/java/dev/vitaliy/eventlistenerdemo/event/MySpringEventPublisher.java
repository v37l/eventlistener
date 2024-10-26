package dev.vitaliy.eventlistenerdemo.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MySpringEventPublisher {

    private final ApplicationEventPublisher eventPublisher;


    public void publishEvent(final String message) {
        System.out.println("publishing my event");
        eventPublisher.publishEvent(new MySpringEvent(this, message));
    }
}

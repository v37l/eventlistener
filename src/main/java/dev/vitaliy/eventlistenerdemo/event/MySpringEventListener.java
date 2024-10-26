package dev.vitaliy.eventlistenerdemo.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class MySpringEventListener  {

    @EventListener
    void onApplicationEvent(MySpringEvent event) {
        System.out.println("received spring custom event: " + event.getMessage());
    }
}

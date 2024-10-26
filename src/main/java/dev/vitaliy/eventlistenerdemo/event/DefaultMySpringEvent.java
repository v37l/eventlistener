package dev.vitaliy.eventlistenerdemo.event;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
class DefaultMySpringEvent extends MySpringEvent {

    private final boolean ezKatka = true;

    public DefaultMySpringEvent() {
        super(new Object(), "default message");
    }
}

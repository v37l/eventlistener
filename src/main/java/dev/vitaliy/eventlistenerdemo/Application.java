package dev.vitaliy.eventlistenerdemo;

import dev.vitaliy.eventlistenerdemo.util.SpELResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	ApplicationListener<ApplicationReadyEvent> onStartup(SpELResolver spelResolver) {
	    return event -> System.out.println(spelResolver.resolveStringValue("#{defaultMySpringEvent.ezKatka == true}"));
	}
}

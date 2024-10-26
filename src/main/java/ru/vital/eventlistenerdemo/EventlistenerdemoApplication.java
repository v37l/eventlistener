package ru.vital.eventlistenerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventlistenerdemoApplication implements CommandLineRunner {

	@Autowired
	private MySringEventPublisher publisher;

	public static void main(String[] args) {

		SpringApplication.run(EventlistenerdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		publisher.publishEvent("this is my custom event");
	}

}

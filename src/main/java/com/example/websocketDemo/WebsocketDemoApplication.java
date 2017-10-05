package com.example.websocketDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebsocketDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebsocketDemoApplication.class, args);
		context.getBean(DatabaseSeeder.class).fillWithTestdata();
	}
}

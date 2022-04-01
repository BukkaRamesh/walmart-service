package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sample.mail.Mail;
import com.sample.service.EmailService;

@SpringBootApplication
@EnableScheduling

public class WalmartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartServiceApplication.class, args);
	}

}

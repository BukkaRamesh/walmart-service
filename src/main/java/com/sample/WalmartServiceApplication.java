package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sample.mail.Mail;
import com.sample.service.EmailService;

@SpringBootApplication

public class WalmartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartServiceApplication.class, args);
	}

}

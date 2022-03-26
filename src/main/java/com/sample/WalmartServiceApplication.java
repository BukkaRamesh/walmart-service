package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sample.service.EmailService;

import ch.qos.logback.core.Context;

@SpringBootApplication
//@ComponentScan("com.sample")
public class WalmartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartServiceApplication.class, args);
		
	}

}

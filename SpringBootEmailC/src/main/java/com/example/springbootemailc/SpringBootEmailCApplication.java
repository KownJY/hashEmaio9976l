package com.example.springbootemailc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootEmailCApplication {

	@Autowired EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailCApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleEmail("asbt478@naver.com"); //받는사람 입력
	}

}

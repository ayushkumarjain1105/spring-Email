package com.dailycodebuffer.SpringEmailClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailClientApplication {
	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

//		service.sendSimbleEmail("ayushkumarjain1105@gmail.com",
//				"This is the email body",
//				"This is the email subject");

		service.sendEmailWithAttachment("ayushkumarjain1105@gmail.com",
				"This is the email body...",
				"Hello Their",
				"D:\\Microservices.docx");
	}
}

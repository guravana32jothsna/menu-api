package com.food.fullstackcomplete;

import com.food.fullstackcomplete.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@EnableScheduling
public class FullstackcompleteApplication {
	@Autowired
	private EmailSendService sendService;
	public static void main(String[] args) {

		SpringApplication.run(FullstackcompleteApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail() {
//		sendService.sendEmail();
//	}
}
//"jyoshnaguravana@gmail.com" , "This is a Scheduled test text ,ignore" , "hello world"
//Customer -------one to one (eager) mapping---->items
//		hence,
//@OnetoOne(cascade = CascadeType.ALL)
//private Item item

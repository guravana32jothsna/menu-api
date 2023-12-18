package com.food.fullstackcomplete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EmailSendService {
    @Autowired
    private JavaMailSender javaMailSender;
//    @Scheduled(cron = "0/30 * * * * ?")
    public void sendEmail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("jyoshnaguravana@gmail.com");
//        message.setTo("jyoshnaguravana@gmail.com");
        message.setTo(email);
        message.setText("This is a Scheduled test text ,ignore");
        message.setSubject("This is a Scheduled test text ,ignore");

        javaMailSender.send(message);
        System.out.println("Mail sent successfully...!!");
    }
}
//String toEmail, String subject, String body
//"jyoshnaguravana@gmail.com" , "This is a Scheduled test text ,ignore" , "hello world"


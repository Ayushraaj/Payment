package com.KafkaProducer.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailService {


    private final JavaMailSender javaMailSender;


    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }



    public void sendMail(String message){


        SimpleMailMessage mail = new SimpleMailMessage();


        mail.setTo("snma2000siraj@gmail.com");

        mail.setSubject("Kafka Producer Status");


        mail.setText(message);


        javaMailSender.send(mail);

    }

}

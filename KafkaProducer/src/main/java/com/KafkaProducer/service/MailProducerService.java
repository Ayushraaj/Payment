package com.KafkaProducer.service;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MailProducerService {


    private final KafkaTemplate<String,String> kafkaTemplate;

    private final MailService mailService;



    public MailProducerService(KafkaTemplate<String,String> kafkaTemplate,MailService mailService){

        this.kafkaTemplate = kafkaTemplate;
        this.mailService = mailService;

    }



    public void sendMessage(String message){

        kafkaTemplate.send("mail",message);
        
        mailService.sendMail(message);


    }

}
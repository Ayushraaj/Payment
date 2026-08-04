package com.KafkaProducer.controller;

import org.springframework.web.bind.annotation.*;

import com.KafkaProducer.service.MailProducerService;



@RestController
@RequestMapping("/mail")
public class MailProducerController {


    private final MailProducerService mailProducerService;


    public MailProducerController(MailProducerService mailProducerService) {

        this.mailProducerService = mailProducerService;

    }



    @PostMapping("/send")
    public String sendMail(@RequestBody String message){

        mailProducerService.sendMessage(message);

        return "Message sent to Kafka topic";

    }

}
package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.amazon.pojo.Pojo;
import com.amazon.service.RegistrationService;

@Controller
public class AmazonRegistration {

    @Autowired
    RegistrationService registrationService;

    @GetMapping("/registration")
    public String doRegistration() {

        return "registration-page";
    }

    @PostMapping("/registredDetails")
    public String registrationSuccessfull(
            @ModelAttribute Pojo request) {

        boolean result =
                registrationService.registerUser(request);

        if(result) {
            return "registrationSuccessfull-page";
        }

        return "Email-exist";
    }
}
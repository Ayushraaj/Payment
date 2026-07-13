package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.amazon.pojo.Pojo;
import com.amazon.service.LogInService;

@Controller
public class AmazonLogIn {

    @Autowired
    LogInService loginService;

    @GetMapping("/login")
    public String getLogin() {

        return "login-page";
    }

    @PostMapping("/successLogIn")
    public String loggedIn(
            @ModelAttribute Pojo request,
            Model model) {

        boolean result =
                loginService.loginService(
                        request.getEmail(),
                        request.getPassword());

        if(result) {

        	String userName  = request.getEmail().split("@")[0];
            model.addAttribute("userName",
            		userName);

            return "LoggedIn-page";
        }

        return "Email-exist";
    }
    
    
    @GetMapping("/forgotPassword")
    public String forgotPassword() {

        return "forgot-password";
    }
    
    @PostMapping("/resetPassword")
    public String resetPassword(
            @ModelAttribute Pojo request) {

        boolean result =
                loginService.resetPassword(
                        request.getEmail(),
                        request.getPassword(),
                        request.getConformPassword());

        if(result) {

            return "password-reset-success";
        }

        return "Email-exist";
    }
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.request.RequestEntity;
import com.example.demo.service.OtpService;

@RestController
public class Controller {

    @Autowired
    private OtpService otpService;

    @PostMapping("/getOtp")
    public String getOtp(@RequestBody RequestEntity req) {

        otpService.getOtpDetails(req.getName(), req.getMobileNumber());

        return "OTP Generated Successfully";
    }

    @PostMapping("/validateOtp/{mobileNumber}/{otp}")
    public String validateOtp(@PathVariable int mobileNumber,
                              @PathVariable int otp) {

        return otpService.verifyOtp(mobileNumber, otp);

    }

}
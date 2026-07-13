package com.example.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OtpEntity;
import com.example.demo.repository.OtpRepo;

@Service
public class OtpService {

    @Autowired
    OtpRepo otpRepo;

    // Generate OTP and save it
    public void getOtpDetails(String name, int mobileNumber) {

        int otp = createOtp();

        OtpEntity otpEntity = new OtpEntity();
        otpEntity.setName(name);
        otpEntity.setMobileNumber(mobileNumber);
        otpEntity.setOtp(otp);

        otpRepo.save(otpEntity);

        System.out.println("Generated OTP : " + otp);
    }

    
    public int createOtp() {

        Random random = new Random();
        return 100000 + random.nextInt(900000);

    }

   
    public String verifyOtp(int mobileNumber, int userOtp) {

        OtpEntity otpEntity = otpRepo.findByMobileNumber(mobileNumber);

        if (otpEntity == null) {
            return "Mobile number not found.";
        }

        if (otpEntity.getOtp() == userOtp) {
            return "OTP Verified Successfully.";
        } else {
            return "Invalid OTP.";
        }

    }

}
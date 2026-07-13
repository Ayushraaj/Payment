package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.pojo.Pojo;
import com.amazon.repository.AmazonRepository;

@Service
public class RegistrationService {

    @Autowired
    AmazonRepository amazonRepo;

    public boolean registerUser(Pojo user) {

        if(amazonRepo.emailExists(user.getEmail())) {

            System.out.println("Email Already Exists");
            return false;
        }

        if(!user.getPassword()
                .equals(user.getConformPassword())) {

            System.out.println("Password Mismatch");
            return false;
        }

        amazonRepo.saveUser(user);

        return true;
    }
}
package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.repository.AmazonRepository;

@Service
public class LogInService {

    @Autowired
    AmazonRepository amazonRepository;

    public boolean loginService(String email,
            String password) {

return amazonRepository.loginCheck(email, password);
}
    
    public boolean resetPassword(String email,
            String password,
            String confirmPassword) {

			if(!password.equals(confirmPassword)) {
				System.out.println("Your pass is missMatched");
			return false;
			}
			
			return amazonRepository.updatePassword(
			email,
			password);
}
}
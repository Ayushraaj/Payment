package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.PrimeUsers;

@Configuration
public class AppConfig {
	
	@Bean("primeUser")
	public PrimeUsers createPrimeUser() {
		
		PrimeUsers p = new PrimeUsers();
		return p;
	}
	

}

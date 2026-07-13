package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.NonPrimeUser;
import com.beans.PrimeUser;

@Configuration
public class AppConfig {
	
	
	@Bean("primeUser")
	public PrimeUser createPrimeUser() {
		
		PrimeUser p = new PrimeUser();
		return p;
	}
	
	@Bean("nonPrimeUser")
	public NonPrimeUser createNonPrimeUser() {
		
		NonPrimeUser np = new NonPrimeUser();
		return np;
	}

}

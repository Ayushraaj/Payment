package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.Beans.AmazonNonPrimeUser;
import com.Beans.AmazonPrimeUser;

@Configuration
@ComponentScan(basePackages = "com.AmazonService")
public class AppConfig {
	
	
	@Bean("AmazonPrimeUser")
	@Scope("singleton")
	public AmazonPrimeUser createUser() {
		AmazonPrimeUser ap = new AmazonPrimeUser("Ayush","Tiger 3", 4, "Voilence", "Bollywood", "Yash Raj Movie");
		return ap;
	}
	
	@Bean("AmazonNonPrimeUser")
	public AmazonNonPrimeUser createUser1() {
		AmazonNonPrimeUser ap1 = new AmazonNonPrimeUser("Ayush","Tiger 3", 4, "Voilence", "Bollywood", "Yash Raj Movie");
		return ap1;
	}
	
	

}

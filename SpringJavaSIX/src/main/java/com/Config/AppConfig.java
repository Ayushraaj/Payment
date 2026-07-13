package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Amazon;

@Configuration
public class AppConfig {
	
	@Bean("Amazon")
	public Amazon createProfile() {
		Amazon amazon = new Amazon();
		amazon.setName("Ayush");
		amazon.setCompany("Amazon ");
		
		return amazon;
	}

}

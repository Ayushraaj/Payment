package com.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.School;

@Configuration
public class AppConfig {
	
	@Bean("school")
	public School createSchool() {
		
		School school = new School();
		school.setName("abcdefghijklomnopqrstuvwxyz");
		return school;
		
	}
	

}

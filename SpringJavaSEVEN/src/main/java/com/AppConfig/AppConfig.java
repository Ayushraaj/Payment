package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Beans.Person;

@Configuration
public class AppConfig {
	
	@Bean("Person")
	public Person createPerson() {
		
		Person p = new Person();
		p.setName("Ayush");
		p.setCity("Lake-Mary");
		p.setState("Florida");
		p.setCountry("United States");
		return p;
		
	}

}

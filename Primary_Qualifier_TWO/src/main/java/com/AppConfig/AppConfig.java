package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.NonPrimeUsers;
import com.beans.PrimeUsers;

@Configuration
@ComponentScan(basePackages = "com.NetflixService")
public class AppConfig {

	@Bean("PrimeUsers")
	public PrimeUsers createPrimeUsers() {
		
		PrimeUsers p = new PrimeUsers("All Of Us Could Die", "Zombie");
		return p;
	}
	
	@Bean("PrimeUsers1")
	public PrimeUsers createPrimeUsers1() {
		
		System.out.println("   Bonjour, Welcome to Netflix ");
		PrimeUsers p = new PrimeUsers("All Of Us Could Die", "Zombie");
		return p;
	}
	
	
	@Bean("NonPrimeUsers")
	public NonPrimeUsers createNonPrimeUser() {
		
		NonPrimeUsers np = new NonPrimeUsers("Komal", "Squid Game", "Violation");
		return np;
	}
}

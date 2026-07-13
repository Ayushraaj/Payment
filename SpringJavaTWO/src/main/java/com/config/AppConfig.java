package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Colour;
import com.beans.Red;
import com.beans.Yellow;

@Configuration
public class AppConfig {
	
	@Bean("colour")
	public Colour createColour() {
		
		Colour colour = new Colour();
		return colour;
	}
	
	
	@Bean("yellow")
	public Yellow createYellow() {
		
		Yellow yellow = new Yellow();
		return yellow;
	}
	
	
	@Bean("red")
	public Red createRed() {
		
		Red red = new Red();
		return red;
	}

}

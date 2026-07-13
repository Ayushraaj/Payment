package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("KA")
	private String state;
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}

	@Value("India")
	private String country;
	
	

}

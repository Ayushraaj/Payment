package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	@Value("Ayush")
	private String firstName;
	
	@Value("Raj")
	private String lastName;
	
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	
	
	
}

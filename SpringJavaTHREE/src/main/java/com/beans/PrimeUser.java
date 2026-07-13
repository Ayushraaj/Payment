package com.beans;

public class PrimeUser implements AmazonPrime {
	
	public void user() {
		AmazonPrime.greetings();
		System.out.println("-----------------------------");
		System.out.println("This is a Prime User");
	}
	
	public void userName() {
		
		System.out.println("The user name is -> Ayush");
	}
	
	

}

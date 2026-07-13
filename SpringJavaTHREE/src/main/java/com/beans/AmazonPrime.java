package com.beans;

public interface AmazonPrime {
	
	public static void greetings() {
		
		System.out.println("        Welcome to Amazon Prime videos         ");
	}
	
	public default void User() {
		
	}
	
	void userName();

}

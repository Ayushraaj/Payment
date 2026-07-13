package com.beanClass;


public class Calculator {
	
	private static Calculator calculator;
	
	private Calculator() {
		
	}
	
	public static Calculator createCalculator() {
		
		if(calculator==null) {
			System.out.println("There is no object for the Calc., so it is getting created");
			calculator = new Calculator(); 
		}
		else {
			System.out.println("The object has already been created for the calculator class");
		}
		
		return calculator;
	}

	

}

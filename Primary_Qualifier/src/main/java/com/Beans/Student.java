package com.Beans;

public class Student {
	
	private String firstName;
	
	private String LastName;
	
	private String country;

	public Student(String firstName, String lastName, String country) {
		
		this.firstName = firstName;
		this.LastName = lastName;
		this.country = country;
	}

	
	public void details() {
		System.out.println( "Student [firstName=" + firstName + ", LastName=" + LastName + ", country=" + country + "]");
	}
	
	
	
	

}

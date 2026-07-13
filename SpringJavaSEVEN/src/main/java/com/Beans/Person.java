package com.Beans;

public class Person {
	
	private String name;
	private String city;
	private String state;
	private String country;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void PersonDetails() {
		System.out.println("Name: "+ name);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Country: "+ country);
	}

}

package com.Beans;

public class Address {
	
	private String cityName;
	private int pincode;
	private String state;
	private String counrtyName;

	public Address(String cityName, int pincode, String state, String countryName) {
		
		this.cityName = cityName;
		this.pincode = pincode;
		this.state = state;
		this.counrtyName = countryName;
	}
	
	public void addressDetails() {
		System.out.println("State: " + state);
		System.out.println("CountryName: " + counrtyName);
	}
	
	
	
}

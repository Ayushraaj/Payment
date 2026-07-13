package com.beans;



public class Amazon {
	
	String name;
	String company;
	
	public  void setName(String name) {
		this.name = name;
	}
	
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void Greetings() {
		
		System.out.println("Welcome to " + company + name);
	}

}

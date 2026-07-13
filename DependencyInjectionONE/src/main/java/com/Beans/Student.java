package com.Beans;

public class Student {
	
	private String name;
	private double salary;
	private String companyName;
	
	private Address address;
	
	public Student(String name, double salary , String companyName, Address address) {
		this.name = name;
		this.salary = salary;
		this.companyName = companyName;
		this.address = address;
	}
	
	public void employeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
		System.out.println("CompanyName: "+ companyName);
		
		
	}
	
	public void setAddress(Address _address) {
		address = _address;
	}
	
	
	

}

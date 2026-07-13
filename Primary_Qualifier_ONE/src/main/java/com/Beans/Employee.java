package com.Beans;


public class Employee {

	private String name;
	private String department;
	private String role;
	private String city;
	
	
	public Employee(String name, String department, String role, String city) {
		
		this.name = name;
		this.department = department;
		this.role = role;
		this.city = city;
	}
	
	public void employeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Role: " + role);
		System.out.println("City: "+ city);
	}
}

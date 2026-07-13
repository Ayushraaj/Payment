package com.beans;

public class Student {
	
	String name;
	String department;
	String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setdepartment(String department) {
		this.department= department;
	}
	
	public void setAddress(String address) {
		this.address=address;
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getdepartment() {
		return department;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void studentDetail() {
		
		System.out.println("Name of the student is -> "+ name);
		System.out.println("His department name is -> "+ department);
		System.out.println(" the address of the student is -> "+ address);
	}

}

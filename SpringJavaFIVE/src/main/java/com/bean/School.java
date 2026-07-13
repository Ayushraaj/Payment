package com.bean;


public class School {
	
	String SchoolName;
	
	public void setName(String SchoolName) {
		this.SchoolName = SchoolName;
	}
	
	public String getName() {
		return SchoolName;
	}
	
	public void printName() {
		System.out.println("The name of the School is -> "+ SchoolName);
	}

}

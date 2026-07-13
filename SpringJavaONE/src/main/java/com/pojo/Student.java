package com.pojo;

public class Student {
	
	String name;
	String college;
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setCollege(String college) {
		this.college= college;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCollege() {
		return college;
	}
	
	
	public void studentDetail() {
		System.out.println("Student name -> "+ name + " college is ->"+ college);
	}

}

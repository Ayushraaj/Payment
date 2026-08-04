package com.beans;

public class School {
	
	private String schoolName;
	private String address;
	private int totalStudents;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	
	public void display() {
		System.out.println("School Name"+ schoolName );
		System.out.println("Address "+ address);
		System.out.println("Total Students "+ totalStudents);
	}
	
	

}

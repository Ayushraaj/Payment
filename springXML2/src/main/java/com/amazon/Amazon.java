package com.amazon;


public class Amazon {
	
	private String company_name;
	private String salary;
	private String location;
	private String employe_name;
	private String employe_clg_name;
	private String position;
	

	
	
	public String getCompany_name() {
		return company_name;
	}




	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}




	public String getSalary() {
		return salary;
	}




	public void setSalary(String salary) {
		this.salary = salary;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getEmploye_name() {
		return employe_name;
	}




	public void setEmploye_name(String employe_name) {
		this.employe_name = employe_name;
	}




	public String getEmploye_clg_name() {
		return employe_clg_name;
	}




	public void setEmploye_clg_name(String employe_clg_name) {
		this.employe_clg_name = employe_clg_name;
	}




	public String getPosition() {
		return position;
	}




	public void setPosition(String position) {
		this.position = position;
	}




	public void display() {
		System.out.println("Name of the Company-> "+ company_name );
		System.out.println("Name of the Employee-> "+ employe_name );
		System.out.println("Total CTC -> "+ salary );
		System.out.println("Role -> "+ position );
	}
	
	
	
	
	
	
	
	
}

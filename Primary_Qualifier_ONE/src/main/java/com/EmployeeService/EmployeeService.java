package com.EmployeeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Beans.Employee;

@Component
public class EmployeeService {

	@Autowired
	@Qualifier("Emp2")
	private Employee e;
	
	public void EmployeeService() {
		System.out.println("this is an employee Service class");
		e.employeeDetails();
	}
}

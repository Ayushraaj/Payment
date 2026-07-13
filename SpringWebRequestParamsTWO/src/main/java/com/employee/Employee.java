package com.employee;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Employee {
	
	@GetMapping("/employee")
	public String getEmployee() {
		
		System.out.println("Inside the controller");
		return "employee-page";
	}
	
	
	@GetMapping("/employeeInfo")
	@ResponseBody
	public String employeeDetails(@RequestParam("employeeName") String name) {
		
		System.out.println("We are inside the employee detail method");
		
		return "The name of the employee is: "+ name + " ";
	}

}

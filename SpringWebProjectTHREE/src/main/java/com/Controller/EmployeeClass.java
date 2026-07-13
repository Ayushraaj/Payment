package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeClass {
	
	@GetMapping("/logIn")
	public String getLogin() {
		
		System.out.println("Inside the controller class");
		return "ayush";
	}

}

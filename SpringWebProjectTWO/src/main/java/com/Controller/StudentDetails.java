package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentDetails {
	
	@GetMapping("/login")
	public String StudentLogin() {
		
		System.out.println("Controller is running");
		return "student";
	}

}

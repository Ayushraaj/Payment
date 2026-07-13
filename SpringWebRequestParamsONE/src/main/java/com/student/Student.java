package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {
	
	
	@GetMapping("/student")
	public String studentName() {
		
		System.out.println("Inside the controller class");
		return "student-page";
		
	}
	
	
	@GetMapping("/studentInfo")
	@ResponseBody
	public String studentDetail(@RequestParam("studentName") String name) {
		
		System.out.println("Inside the student detail class");
		
		return "The name of the student is : "+ name +" ";
	}

}

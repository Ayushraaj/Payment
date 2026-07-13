package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {
	
	
	@GetMapping("/student")
	public String getStudent() {
		
		System.out.println("Inside the get Student method");
		return "student-page";
	}
	
	@GetMapping("/studentInfo/{name}")
	@ResponseBody
	public String studentDetail(@PathVariable("name") String name) {
		
		System.out.println("Inside the student Detail method");
		return "The name of the Student is: -> "+ name + " ";
	}
	

}

package com.school;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class School {
	
	@GetMapping("/school")
	public String getSchool() {
		System.out.println("inside the get school method");
		return "school-page";
	}
	
	@GetMapping("/schoolInfo")
	@ResponseBody
	public String schoolDetails(@RequestParam("schoolName") String schoolName, 
			@RequestParam("studentName") String studentName,
			@RequestParam("city") String city,
			@RequestParam("state") String state,
			@RequestParam("country") String country
			
			
			) {
		
		System.out.println("Inside the school details method");
		

		
		return "Your Submitted Details are listed below <br></br>" +
	       "School Name: -> " + schoolName + "<br></br>"+
	       " Student Name: -> " + studentName + "<br></br>"+
	       " City: -> " + city + "<br></br>"+
	       " State: -> " + state + "<br></br>"+
	       " Country: -> " + country;
	}

}

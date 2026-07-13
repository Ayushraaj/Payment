package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pojo.Pojo;

@Controller
public class SchoolController {
	
	
	@GetMapping("/school")
	public String getSchool() {
		
		System.out.println("Inside the get School method");
		return "school";
	}
	
	
	
	@PostMapping("/info")
	public String getSchoolInfo(@ModelAttribute Pojo pojo, Model model) {
		
		System.out.println("School Name: "+ pojo.getSchoolName());
		String schoolName =pojo.getSchoolName();
		System.out.println("City Name: "+ pojo.getCity());
		
		String cityName = pojo.getCity();
		System.out.println("State Name: "+ pojo.getState());
		
		String stateName = pojo.getState();
		System.out.println("Country Name: "+ pojo.getCountry());
		
		String countryName = pojo.getCountry();
		

		
		model.addAttribute("sName", schoolName);
		model.addAttribute("cName", cityName);
		model.addAttribute("s1Name", stateName);
		model.addAttribute("c1Name", countryName);
		
		
		
		
		return "schoolinfo";
	}

}

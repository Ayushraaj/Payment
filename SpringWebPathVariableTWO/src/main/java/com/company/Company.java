package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Company {
	
	@GetMapping("/company")
	public String getCompany() {
		
		System.out.println("Inside the get company method");
		return "company-page";
	}
	
	
	
	@GetMapping("/companyInfo/{companyName}/{city}/{country}")
	@ResponseBody
	public String companyDetails(@PathVariable("companyName") String companyName
			, @PathVariable("city") String city,
			@PathVariable("country") String country
			) {
		
		System.out.println("Inside companyInfo method");
		return "Company Name: ->"+companyName+" , City: ->"+city+ " , Country: -> " +country+ " ";
	}

}

package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Company {
	
	@GetMapping("/company")
	public String getCompnay() {
		System.out.println("Inside the getCompany method");
		return "company-home";
	}
	
	@GetMapping("/companyInfo")
	@ResponseBody
	public String getCompanyDetails(@RequestParam("companyName") String companyName, @RequestParam("employeeName") String employeeName) {
		
		System.out.println("Inside the get Company detail Method");
		return "Company name: ->   "+ companyName+ ",   Employe Name: ->  "+ employeeName+ " ";
	}
}

package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AmazonController {
	
	@GetMapping("/amazon")
	public String getAmazon() {
		
		System.out.println("Inside the get amazon method ");
		return "amazon-home";
	}

}

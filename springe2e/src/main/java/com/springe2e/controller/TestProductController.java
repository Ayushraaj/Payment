package com.springe2e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springe2e.service.TestProductService;

@RestController
@Profile("test")
public class TestProductController {
	
	@Autowired
	TestProductService testProductService;
	
	
	@GetMapping("/lengthChecker")
	public String lengthController() {
		
		System.out.println("Inside the length checker controller");
		return testProductService.checkLength();
		
	}
	
	
	@GetMapping("/deletelength")
	public String deleteLength() {
		
		System.out.println("Inside the length checker controller");
		return testProductService.deleteLength();
		
	}

}

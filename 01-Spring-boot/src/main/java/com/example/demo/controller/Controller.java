package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/test")
	public String test() {
		
		System.out.println("this is a test controller");
		
		return " this is a test";
	}
	
	

}

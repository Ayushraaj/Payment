package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.request.Request;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	com.amazon.service.Service service;
	
	@GetMapping("/amazon")
	public String getAmazon() {
		
		return "amazon-home";
		
	}
	
	@PostMapping("/submit")
	
	public String amazonDetails(@ModelAttribute Request request, Model model) {
		
		System.out.println(request.getProductName());
		System.out.println(request.getProductPrice());
		
		service.userDetails(request);
		
		
		return "success";
	}

}

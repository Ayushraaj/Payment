package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.bean.AmazonPojo;
import com.amazon.service.AmazonService;

@Controller
public class AmazonController {
	
	@Autowired
	AmazonService amazonService;
	
	
	@PostMapping("/amazonInfo")
	public String getAmazonDetails(@ModelAttribute AmazonPojo request , Model model) {
		
		System.out.println("Inside the Amazon Detail method");
		
		System.out.println("Product Name: "+ request.getProductName());
		System.out.println("Product Price: "+request.getPrice());
		System.out.println("Product Quantity: "+ request.getQuantity());
		
		model.addAttribute("productName", request.getProductName());
		model.addAttribute("productPrice", request.getPrice());
		model.addAttribute("productQuantity", request.getQuantity());
		
		
		amazonService.getService();
		
		return "amazon-details";
	}

}

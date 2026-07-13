package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zepto.bean.ControllerRequest;
import com.zepto.service.ZeptoService;

@Controller
public class ZeptoController {
	
	@Autowired
	ZeptoService zeptoService;
	
	@GetMapping("/zepto")
	public String getZepto() {
		
		System.out.println("Inside the get Zepto method");
		
		return "zepto-home";
	}
	
//	@PostMapping("/zeptoInfo")
//	public String zeptoInfo(@ModelAttribute ControllerRequest request, Model model) {
//		
//		String ordeName =request.getOrderName();
//		System.out.println("Order Name: "+ request.getOrderName());
//		System.out.println("Quantity: "+ request.getQuantity());
//		System.out.println("Price: "+ request.getPrice());
//		
//		model.addAttribute("orderName",ordeName);
//		zeptoService.getService();
//		
//		
//		return "zepto-details";
//		
//	}

}

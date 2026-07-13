package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.request.orderReq;
import com.zepto.service.ProdService;

@Controller
public class controller {
	@Autowired
	ProdService service;
	
	@PostMapping("productdetails")
	@ResponseBody
	public String insertdetails(orderReq order) {
		
		 return service.InsertData(order);
		
		
	}

}

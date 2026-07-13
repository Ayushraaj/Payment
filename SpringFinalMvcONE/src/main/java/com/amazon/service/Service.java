package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.amazon.entity.Entity;
import com.amazon.request.Request;


@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	com.amazon.repository.Repository repository;
	
	public void userDetails(Request request) {
		
		Entity e = new Entity();
		e.setProductName(request.getProductName());
		e.setProductPrice(request.getProductPrice());
		
		System.out.println("Inside the service class");
		
		repository.save(e);
		
		
		
	}

}

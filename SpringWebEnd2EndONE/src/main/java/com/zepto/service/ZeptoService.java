package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.repository.ZeptoRepo;



@Service
public class ZeptoService {
	
	@Autowired
	ZeptoRepo z;
	
	public void getService() {
		
		System.out.println("Inside the zepto Service");
		
	}
	
	z.getRepo();

}

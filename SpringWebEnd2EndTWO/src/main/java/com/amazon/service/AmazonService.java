package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.repo.AmazonRepo;

@Service
public class AmazonService {
	
	@Autowired
	AmazonRepo amazonRepo;
	
	public void getService() {
		
		System.out.println("Amazon service method");
		
		amazonRepo.getRepo();
	}

}

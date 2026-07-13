package com.AmazonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beans.AmazonNonPrimeUser;
import com.Beans.AmazonPrimeUser;

@Component
public class AmazonService {

	@Autowired
	private AmazonPrimeUser amazonPrimeUser;
	
	@Autowired
	private AmazonNonPrimeUser amazonNonPrimeUser;
	
	public void userDetails() {
		System.out.println("We are inside the service class");
		amazonPrimeUser.PrimeMember();
		//amazonNonPrimeUser.NonPrimeMember();
	}
	
	
}

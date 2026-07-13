package com.NetflixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.beans.NonPrimeUsers;
import com.beans.PrimeUsers;

@Component
public class NetflixService {
	
	@Autowired
	@Qualifier("PrimeUsers1")
	private PrimeUsers p;
	
	@Autowired
	private NonPrimeUsers np;
	
	
	public void AboutPrimeUser() {
		p.PrimeMember();
	}
	
	
	
	public void NonPrimeUser() {
		np.NonPrimeMember();
	}
}

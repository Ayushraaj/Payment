package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.request.FlightRequest;
import com.transaction.request.PaymentRequest;
import com.transaction.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/bookTickets")
	public String createFlightTicket(@RequestBody FlightRequest req) {
		
		System.out.println("Inside the bookTicktes controller method");
		return flightService.createFlightTicket(req);
		
	}
	
	@PostMapping("/bookTickets/doPayment")
	public String doPayment(@RequestBody PaymentRequest req) {
		System.out.println("Inside the do payment method of controller");
		return flightService.doPayment(req);
	}

}

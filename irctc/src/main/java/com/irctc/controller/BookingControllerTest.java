package com.irctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.response.BookingResponseTest;
import com.irctc.service.BookingServiceTest;

@RestController
@Profile("test")
public class BookingControllerTest {
	
	@Autowired
	BookingServiceTest bookingServiceTest;
	
	@PostMapping("/ticketBooking/details/{userId}")
	public BookingResponseTest ticketDetails(@PathVariable("userId") long userId) {
		
		System.out.println("Inside the test controller");
		
		return bookingServiceTest.response(userId);
		
	}

}

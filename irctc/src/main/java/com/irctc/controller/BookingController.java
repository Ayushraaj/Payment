package com.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.request.BookingRequest;
import com.irctc.response.BookingResponse;
import com.irctc.response.BookingResponseRecords;
import com.irctc.service.BookingRecordsService;
import com.irctc.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	BookingRecordsService bookingRecordsService;
	
	
	
	@PostMapping("/ticketBooking")
	public BookingResponse createBooking(@RequestBody BookingRequest req) {
		
		String passengerName = req.getPassengeName();
		String source= req.getSource();
		String destination = req.getDestination();
		int ticketPrice = req.getTicketPrice();
		
		
		System.out.println(passengerName);
		System.out.println(source);
		System.out.println(destination);
		System.out.println(ticketPrice);
		
		
		return bookingService.bookTicket(req);
		
		
	}
	
	
	@GetMapping("/allBookingDetails")
	public List<BookingResponseRecords> getRecords(@RequestParam("pageNumber") String pageNumber, @RequestParam("records") String records) {
		return bookingRecordsService.getAll(pageNumber, records);
		
	}
	

}

package com.irctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.entity.BookingEntity;
import com.irctc.repo.BookingRepo;
import com.irctc.request.BookingRequest;
import com.irctc.response.BookingResponse;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;
	
	
	
	public BookingResponse bookTicket(BookingRequest request) {
		
		BookingEntity booking = new BookingEntity();
		booking.setPassengeName(request.getPassengeName());
		booking.setSource(request.getSource());
		booking.setDestination(request.getDestination());
		booking.setTicketPrice(request.getTicketPrice());
		booking.setBookingStatus("Pending");
		booking.setLocalDateTime(request.getLocalDateTime().now());
		
		bookingRepo.save(booking);
		
		
		BookingResponse bookingResponse = new BookingResponse();
		bookingResponse.setPassengeName(booking.getPassengeName());
		bookingResponse.setSource(booking.getSource());
		bookingResponse.setDestination(booking.getDestination());
		bookingResponse.setTicketPrice(booking.getTicketPrice());
		bookingResponse.setBookingStatus(booking.getBookingStatus());
		bookingResponse.setLocalDateTime(booking.getLocalDateTime().now());
		
		return bookingResponse;
	}
	

}

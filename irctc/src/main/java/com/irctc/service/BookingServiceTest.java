package com.irctc.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import com.irctc.entity.BookingEntity;
import com.irctc.repo.BookingRepo;
import com.irctc.response.BookingResponseTest;

@Service
@Profile("test")
public class BookingServiceTest {
	
	@Autowired
	BookingRepo bookingRepo;
	
	
	public BookingResponseTest response(long userId) {
		
		Optional<BookingEntity> user = bookingRepo.findById(userId);
		BookingResponseTest bookingResponseTest = new BookingResponseTest();
		
		if (user.isPresent()) {

		    BookingEntity bookingEntity = user.get();
		    bookingEntity.setBookingStatus("Active");

		    bookingResponseTest.setBookingStatus("Active");
		    bookingResponseTest.setSeatNumber("A2");
		    bookingResponseTest.setDestination(bookingEntity.getDestination());
		    bookingResponseTest.setTicketPrice(bookingEntity.getTicketPrice());
		    bookingResponseTest.setSource(bookingEntity.getSource());
		    

		    bookingResponseTest.setPassengeName(bookingEntity.getPassengeName());

		    bookingResponseTest.setPnrNumber(
		            bookingResponseTest.getSeatNumber() +
		            bookingEntity.getBookingId()
		            + bookingEntity.getPassengeName()
		    );
		    bookingEntity.setPnrNumber(bookingResponseTest.getSeatNumber() +
		            bookingEntity.getBookingId()
		            + bookingEntity.getPassengeName());
		    
		    
		    bookingRepo.save(bookingEntity);
		    
		    

		}
		
		else {
			System.out.println("Pls provde a valid user id");
		}
		
		
		
		
		
		return bookingResponseTest;
	}

}

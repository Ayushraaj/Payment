package com.irctc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.irctc.entity.BookingEntity;
import com.irctc.entity.BookingRecords;
import com.irctc.repo.BookingRecordsRepo;
import com.irctc.repo.BookingRepo;
import com.irctc.response.BookingResponseRecords;

@Service
public class BookingRecordsService {

	@Autowired
	BookingRepo bookingRepo;

	@Autowired
	BookingRecordsRepo bookingRecordsRepo;

	public List<BookingResponseRecords> getAll(String pageNumber, String records) {
		
		Pageable pageable= PageRequest.of(Integer.parseInt(pageNumber), Integer.parseInt(records));

		Page<BookingEntity> allRecords = bookingRepo.findAll(pageable);

		List<BookingResponseRecords> bookingResponseRecords = new ArrayList<BookingResponseRecords>();

		for (BookingEntity oneRecord : allRecords) {

			String name = oneRecord.getPassengeName();
			String status = oneRecord.getBookingStatus();
			String pnrNumber = oneRecord.getPnrNumber();
			long bookingId = oneRecord.getBookingId();

			System.out.println("PassengerName: " + name);
			System.out.println("TicketStatus: " + status);
			System.out.println("Pnr Number: " + pnrNumber);

			BookingRecords bookingRecords = new BookingRecords();

			bookingRecords.setPassengerName(name);
			bookingRecords.setBookingStatus(status);
			bookingRecords.setPnrNumber(pnrNumber);
			bookingRecords.setBookingId(bookingId);

			bookingRecordsRepo.save(bookingRecords);

			BookingResponseRecords response = new BookingResponseRecords();

			response.setPassengerName(bookingRecords.getPassengerName());
			response.setBookingStatus(bookingRecords.getBookingStatus());
			response.setPnrNumber(bookingRecords.getPnrNumber());
			response.setBookingId(bookingRecords.getBookingId());

			bookingResponseRecords.add(response);

		}

		return bookingResponseRecords;

	}

}
package com.transaction.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.transaction.entity.FlightEntity;
import com.transaction.entity.PaymentEntity;
import com.transaction.repo.FlightRepo;
import com.transaction.repo.PaymentRepo;
import com.transaction.request.FlightRequest;
import com.transaction.request.PaymentRequest;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FlightService {
	
	@Autowired
	FlightRepo flightRepo;
	
	@Autowired
	PaymentRepo paymentRepo;
	
	
	
	public String createFlightTicket(FlightRequest request) {
		
		String flightName = request.getFlightName();
		String passengerName = request.getPassengerName();
		int flightPrice = request.getFlightPrice();
		String source = request.getSource();
		String destination = request.getDestination();
		String isFoodAdded = request.getIsFoodAdded();
		String isExtraLaguge = request.getIsExtraLaguge();
		String assistanceNeeded = request.isAssistanceNeeded();


		FlightEntity entity = new FlightEntity();
		
		entity.setFlightName(flightName);
		entity.setPassengerName(passengerName);
		entity.setFlightPrice(flightPrice);
		entity.setSource(source);
		entity.setDestination(destination);
		entity.setIsFoodAdded(isFoodAdded);
		entity.setIsExtraLaguge(isExtraLaguge);
		entity.setAssistanceNeeded(assistanceNeeded);
		
		flightRepo.save(entity);

		
		return "Trying jenkins , pls do the payment";
	}
	
	
	public String doPayment(PaymentRequest req) {
		
		Long flightId = req.getFlightId();
		String payemntMode = req.getPaymentMode();
		
		Optional<FlightEntity> flight_id = flightRepo.findById(flightId);
		
		if(flight_id.isPresent()) {
			
			
			
			FlightEntity entity = flight_id.get();
			entity.setSeatNumber("A2");
			entity.setFlightStatus("Confirmed");
			entity.setIsWindowSeat("Yes");
			entity.setFlightPnrNumber("SA12131");
			entity.setBookingTicketdate(LocalDate.now());
			entity.setTerminalNumber("T1");
			flightRepo.save(entity);
			
			
			PaymentEntity paymentEntity = new PaymentEntity();
			
			try {
				System.out.println("pls wait we are doing payments");
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			paymentEntity.setPaymentDate(LocalDate.now());
			paymentEntity.setFlightId(flightId);
			
			paymentEntity.setPaymentMode(payemntMode);
			paymentEntity.setPaymentStatus("Payment Done");
			
			
			paymentRepo.save(paymentEntity);
			System.out.println("Your payment has been done successfullyy....");
			return "Your Payment has been done.. Check your ticket details now..";
			
		}
		
		return "Pls provide a valid Flight Id";
		
		
	}

}

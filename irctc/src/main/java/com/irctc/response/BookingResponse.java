package com.irctc.response;

import java.time.LocalDateTime;

public class BookingResponse {
	
	private String passengeName;
	private String source;
	private String destination;
	private int ticketPrice;
	private String bookingStatus;
	
	private LocalDateTime localDateTime;
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	public String getPassengeName() {
		return passengeName;
	}
	public void setPassengeName(String passengeName) {
		this.passengeName = passengeName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}

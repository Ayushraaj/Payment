package com.irctc.response;

import org.springframework.context.annotation.Profile;


public class BookingResponseTest {
	
	private String passengeName;
	private String source;
	private String destination;
	private int ticketPrice;
	private String bookingStatus;
	private String seatNumber;
	private String pnrNumber;
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
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	
	

}

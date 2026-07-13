package com.irctc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookingRecords")
public class BookingRecords {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingRecordsId;
	
	private String passengerName;
	private String bookingStatus;
	private String pnrNumber;
	private long bookingId;
	
	
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public long getBookingRecordsId() {
		return bookingRecordsId;
	}
	public void setBookingRecordsId(long bookingRecordsId) {
		this.bookingRecordsId = bookingRecordsId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	

}

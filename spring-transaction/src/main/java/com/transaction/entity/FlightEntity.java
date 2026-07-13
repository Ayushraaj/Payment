package com.transaction.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flightTable")
public class FlightEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flightId;

	private String flightName;
	private String passengerName;
	private int flightPrice;
	private String source;
	private String destination;
	private String seatNumber;
	private String flightStatus;
	private String isWindowSeat;
	private String flightPnrNumber;
	private String isFoodAdded;
	private String isExtraLaguge;
	private LocalDate bookingTicketdate;
	private String terminalNumber;
	private String assistanceNeeded;
	
	
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(int flightPrice) {
		this.flightPrice = flightPrice;
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
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	public String getIsWindowSeat() {
		return isWindowSeat;
	}
	public void setIsWindowSeat(String isWindowSeat) {
		this.isWindowSeat = isWindowSeat;
	}
	public String getFlightPnrNumber() {
		return flightPnrNumber;
	}
	public void setFlightPnrNumber(String flightPnrNumber) {
		this.flightPnrNumber = flightPnrNumber;
	}
	public String getIsFoodAdded() {
		return isFoodAdded;
	}
	public void setIsFoodAdded(String isFoodAdded) {
		this.isFoodAdded = isFoodAdded;
	}
	public String getIsExtraLaguge() {
		return isExtraLaguge;
	}
	public void setIsExtraLaguge(String isExtraLaguge) {
		this.isExtraLaguge = isExtraLaguge;
	}
	public LocalDate getBookingTicketdate() {
		return bookingTicketdate;
	}
	public void setBookingTicketdate(LocalDate bookingTicketdate) {
		this.bookingTicketdate = bookingTicketdate;
	}
	public String getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	public String isAssistanceNeeded() {
		return assistanceNeeded;
	}
	public void setAssistanceNeeded(String assistanceNeeded) {
		this.assistanceNeeded = assistanceNeeded;
	}
	
	
	
	

}

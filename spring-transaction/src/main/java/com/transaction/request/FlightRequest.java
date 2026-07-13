package com.transaction.request;


public class FlightRequest {
	
	private String flightName;
	private String passengerName;
	private int flightPrice;
	private String source;
	private String destination;
	private String isFoodAdded;
	private String isExtraLaguge;
	private String assistanceNeeded;
	
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
	public String isAssistanceNeeded() {
		return assistanceNeeded;
	}
	public void setAssistanceNeeded(String assistanceNeeded) {
		this.assistanceNeeded = assistanceNeeded;
	}


}

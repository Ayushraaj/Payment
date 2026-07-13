package com.beans;

public class Payment {

	
	private String bankName;
	private String refNumber;
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
	
	
	public String getBankName() {
		return bankName;
	}
	
	public String getRefNumber() {
		return refNumber;
	}


	public void BankDetails() {
		System.out.println( "Payment [bankName=" + bankName + ", refNumber=" + refNumber + "]");
	}
	
	
}


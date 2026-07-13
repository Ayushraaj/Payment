package com.beans;


public class Abstraction {
	
	public void payment() {
		checkBalance();
		minBalance();
		doPay();
		
	}
	
	private void checkBalance() {
		System.out.println("Balance checking");
	}
	
	private void minBalance() {
		System.out.println("You have required Bal, you can proceed now");
	}
	
	private void doPay() {
		System.out.println("You have done a transaction of 10Lakh");
	}
	

}

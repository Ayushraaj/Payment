package com.interfacep;


interface Bank{
	
	void pay();
	void trans();
	
	private static void logic() {
		System.out.println("This is the logic available inside the mail and sms");
	}
	
	public static void sendSMS() {
		Bank.logic();
		System.out.println("Sending sms..........");
	}
	
	public static void sendEmail() {
		Bank.logic();
		System.out.println("Sending mail..........");
	}
	public default void passbook() {
		
	}
}

class Gpay implements Bank{
	
	public void pay() {
		System.out.println("This is a google pay method");
		Bank.sendEmail();
	}
	
	public void trans() {
		System.out.println("This is a google trans method");
		
	}
	
	
	
	
	
	
}

class RularBank implements Bank{
	
	public void pay() {
		System.out.println("This is a RularBank pay method");
	}
	
	public void trans() {
		System.out.println("This is a RularBank trans method");
	}
	
	public void passbook() {
		System.out.println("This a new passbook feature for the RularBank");
	}
	
}



public class Interfaceclass {
	
public static void main(String[] args) {
	Gpay g = new Gpay();
	g.pay();
	g.trans();
	Bank.sendEmail();
	
	System.out.println("----------------------------------");
	
	RularBank rb = new RularBank();
	rb.pay();
	rb.trans();
	rb.passbook();
	Bank.sendEmail();
	
}
	

}

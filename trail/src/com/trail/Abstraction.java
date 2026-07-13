package com.trail;



class AmericanBank{
	
	public void method() {
		
		checking_bal();
		bal_avail();
		payment();
		debit();
		receiver();
		walk();
	}
	
	private void checking_bal() {
		System.out.println("Checking if the bal is available or not");
	}
	
	private void bal_avail() {
		System.out.println("Bal is available");
	}
	
	private void payment() {
		System.out.println("Paying the money");
	}
	private void debit() {
		System.out.println("money has been debiated from your account");
	}
	
	private void receiver() {
		System.out.println("Money received by the user");
	}
	
	private void walk() {
		System.out.println("You can leave now");
	}
}



public class Abstraction {
	public static void main(String[] args) {
		
		AmericanBank b = new AmericanBank();
		b.method();
	}

}

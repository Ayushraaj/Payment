package com.MultiThreading;



class Payment{
	
	public synchronized void GooglePay() {
		
		for(int i=0; i<10; i++) {
			System.out.println("We are using GooglePay to pay the amount " + i);
			System.out.println("This payment is done by -> " + Thread.currentThread().getName());
		}
		System.out.println("=========================");
	}
	
	public synchronized void PhonePay() {
		
		for(int i=0; i<10; i++) {
			System.out.println("We are using PhonePay to pay the amount " + i);
			System.out.println("This payement is done by -> " + Thread.currentThread().getName());
		}
		System.out.println("====================");
	}

}

class Paying extends Thread{
	
	Payment p;
	
	Paying(Payment p){
		this.p = p;
	}
	
	public void run() {
		p.GooglePay();
		p.PhonePay();
	}
}



public class MultiThreading4 {
	
	public static void main(String[] args) {
		
		Payment p = new Payment();
		Paying paying = new Paying(p);
		paying.setName("Ayush");
		paying.start();
		
		Paying paying1 = new Paying(p);
		paying1.setName("Ayush 's  friend");
		paying1.start();
		
		
		
	}
	

}

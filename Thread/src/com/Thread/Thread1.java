package com.Thread;


class Payment{
	
	public synchronized void GooglePayment() {
		
		 for(int i=0; i<10; i++) {
			 
			 System.out.println("This payment is done by " + Thread.currentThread().getName());
		 }
	}
	
	public  synchronized void PhonePay() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("This payemet is done by " + Thread.currentThread().getName());
		}
	}
}



class GooglePay extends Thread{
	
	Payment p;
	GooglePay( Payment p){
		this.p = p;
	}
	
	public void run() {
		
		p.GooglePayment();
	}
	
}

class PhonePay extends Thread{
	
	Payment p;
	PhonePay(Payment p){
		this.p = p;
	}
	
	public void run() {
		
		p.PhonePay();
	}
	
}




public class Thread1 {
	public static void main(String[] args) {
		 
		Payment p = new Payment();
		
		GooglePay Gpay = new GooglePay(p);
		Gpay.setName("Gpay");
		Gpay.start();
		
		
		PhonePay phonePay = new PhonePay(p);
		phonePay.setName("PhonePay");
		phonePay.start();

	}

}

package com.MultiThreading;


class Solver{
	public synchronized void print_even() {
		
		for(int number =0; number <20; number++) {
		if(number%2==0) {
			System.out.println("Pls wait we are using PhonePay now.... "+ Thread.currentThread().getName());
			}
		}
		
		System.out.println("We have completed all the trans related to PhonePay");
		
	}
	
	public synchronized void print_odd() {
		
		for(int number =0; number <20; number++) {
		if(number%2!=0) {
			
			System.out.println("pls  wait we are using GooglePay now ... "+ Thread.currentThread().getName());
		}
		
		
		}
		System.out.println("We have completed all the trans related to GooglePay");
		
		
	}
}

class Even extends Thread{
	
	Solver s;
	Even(Solver s){
		this.s = s;
	}
	
	public void run() {
		s.print_even();
	}
}

class Odd extends Thread{
	
	Solver s;
	Odd(Solver s){
		this.s = s;
	}
	
	public void run() {
		s.print_odd();;
	}
}


public class MultiThreading3 {
	public static void main(String[] args) throws InterruptedException {
		Solver s = new Solver();
		Even e = new Even(s);
		e.setName("PhonePay");
		e.start();
		//e.join();
		Solver s1 = new Solver();
		
		Odd o = new Odd(s1);
		o.setName("GoogelPay");
		o.start();

	}

}

package com.MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

//Introduced in Java 5/1.5

//ReentrantLock lock = new ReentrantLock();



class Math{
	
	
	
	public void Even() {
		
		ReentrantLock reentrant_lock = new ReentrantLock();
		for(int number =0; number<10; number++) {
			
			reentrant_lock.lock();
			if(number%2==0) {
				System.out.println("Even number is -> " + number);
			}
			
		}
		
	}
	
	public void Odd() {
		for(int number =0; number <10; number++) {
			
			if(number%2!=0) {
				System.out.println("Odd number is -> "+ number);
			}
		}
	}
	
	
	
	
}


class Even_number extends Thread{
	
	Math m;
	Even_number(Math m){
		this.m =m;
	}
	
	public void run() {
		m.Even();
		
	}
}

class Odd_number extends Thread{
	
	Math m;
	Odd_number(Math m){
		this.m =m;
	}
	
	public void run() {
		m.Odd();
		
	}
}
public class ReenternedLock {
	public static void main(String[] args) {
		
		Math m = new Math();
		Even_number  e = new Even_number(m);
		e.start();
		Odd_number  o = new Odd_number(m);
		o.start();
	}

}

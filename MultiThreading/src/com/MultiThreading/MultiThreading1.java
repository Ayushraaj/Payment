package com.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.*;


class Downloading implements Runnable{
	
	private String movie;
	
	Downloading(String name){
		this.movie = name;
		
	}
	
	public void run() {
		
		try {
			System.out.println("Downloading your fav movie  " + movie + " pls wait....");
			Thread.sleep(10000);
			System.out.println("Your movie has been downloaded Successfully...");
			System.out.println("It is downlaoded by the thread " + Thread.currentThread().getName());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}

public class MultiThreading1 {

	public static void main(String[] args) {
		
		Downloading d = new Downloading("Scarlet");
		ExecutorService e = Executors.newFixedThreadPool(1);
		
		e.execute(d);
		e.shutdown();
		
		

	}

}

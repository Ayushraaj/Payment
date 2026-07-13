package com.MultiThreading;




class Movie extends Thread{
	
	public void run()  {
		System.out.println("Your movie is Getting Downloadded pls wait .............");
		try {
			Thread.sleep(15000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Your Movie has been downloaded Successfully..");
	}
}


public class Join {
	public static void main(String[] args) throws InterruptedException {
		
		Movie m = new Movie();
		m.start();
		m.join();
		Thread.sleep(1000);
		System.out.println("Your can watch now.. ");
		
		

	}

}

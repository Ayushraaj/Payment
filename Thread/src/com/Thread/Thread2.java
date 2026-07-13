package com.Thread;



class Ticket{
	
	boolean is_ticket_counter_open = false;
	
	public synchronized void get_ticket()  throws InterruptedException{
		
		while(!is_ticket_counter_open) {
			
			System.out.println("People are waiting in the QUEUE for the ticket");
			wait();  // release the object lock, before going to waiting state
			Thread.sleep(10000); // hold the object lock
			
		}
		System.out.println("Ticket is  getting collected by the People");
		
	}
	
	
	public synchronized void open_counter() throws InterruptedException {
		
		is_ticket_counter_open = true;
		System.out.println("Opening the ticket counter......");
		notify();
		Thread.sleep(5000); // hold the object lock
		System.out.println("Ticket counter has opened NOW..........");
		
	}
}


public class Thread2 {
	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		
		new Thread(() -> {
			try {
				t.get_ticket();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}).start();
	
		new Thread(() -> {
			try {
				t.open_counter();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}).start();
		
		
	}

}

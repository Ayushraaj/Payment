package com.Thread;


class Movie{
	
	boolean is_ticket_avail = false;
	
	public synchronized void get_ticket() throws InterruptedException {
		
		System.out.println("People are waiting at the counter for tickets");
		wait();
		Thread.sleep(10000);
		System.out.println("People starts getting their tickets from the counter");
	}
	
	
	public synchronized void open_counter()  throws InterruptedException {
		
		System.out.println("Opening the counter for the ticket");
		Thread.sleep(4000);
		notify();
		System.out.println("counter has opened now");
	}
	
}


public class Thread3 {
	public static void main(String[] args) {
		Movie t = new Movie();
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

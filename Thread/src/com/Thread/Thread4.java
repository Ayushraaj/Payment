package com.Thread;


// wait always inside sync -> cause it has to release the lock , before going to waiting state ->  otherwise we will get IllegalStateMonitoringException
// sleep can works on both sync or without sync



class HomeWork{
	
	public synchronized void doing_home_work()  throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			
			//Thread.sleep(3000);
			System.out.println(i + " Home work is done by " + Thread.currentThread().getName());
			wait(2000);
			
		}
	}
}

class MyThread  extends Thread{
	
	HomeWork h;
	MyThread(HomeWork h){
		this.h = h;
	}
	
	public void run() {
		try {
		h.doing_home_work();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}


public class Thread4 {
	public static void main(String[] args) {
		HomeWork h = new HomeWork();
		MyThread t = new MyThread(h);
		t.setName("Ayush");
		t.start();
		
	}

}

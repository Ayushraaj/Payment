package com.MultiThreading;


class HomeWork{
	
	public String home_work;
	HomeWork(String home_work){
		this.home_work = home_work;
	}
	
	public String get_home_work() {
		return home_work;
	}
}


class Thread1 extends Thread{
	
	HomeWork hw1;
	HomeWork hw2;
	Thread1(HomeWork hw1, HomeWork hw2){
		this.hw1 = hw1;
		this.hw2 = hw2;
	}
	
	public void run() {
		
		synchronized(hw1) {
			
			System.out.println("Executing hw1 " + hw1.get_home_work());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
			}
			synchronized(hw2) {
				System.out.println("Executing hw2 " + hw2.get_home_work());
			}
		}
		
	}
	
}



class Thread2 extends Thread{
	
	HomeWork hw2;
	HomeWork hw1;
	Thread2(HomeWork hw2, HomeWork hw1){
		this.hw2 = hw2;
		this.hw1 = hw1;
	}
	
	public void run() {
		
		synchronized(hw2) {
			
			System.out.println("Executing hw2 " + hw2.get_home_work());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
			}
			synchronized(hw1) {
				System.out.println("Executing hw1 " + hw1.get_home_work());
			}
		}
		
	}
	
}




public class MultiThreading7 {

	public static void main(String[] args) {
		
		HomeWork hw1 = new HomeWork("HomeWork 1");
		HomeWork hw2 = new HomeWork("HomeWork 2");
		
		Thread1 t1 = new Thread1(hw1, hw2);
		Thread2 t2 = new Thread2(hw2, hw1);
		
		t1.start();
		t2.start();
		
		

	}

}

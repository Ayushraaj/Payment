package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task{
	
	public void task() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("This number " + i + " is printed by the thread -> " + Thread.currentThread().getName());
		}
	}
}



class Ayush implements Runnable{
	
	Task t;
	Ayush(Task t){
		this.t = t;
	}
	public void run() {
		
	   t.task();
	}
}



public class MultiThreading2 {
	public static void main(String[] args) {
		
		Task t = new Task();
		
		// total number of threads = 5;
		ExecutorService exe = Executors.newFixedThreadPool(5);
		
		// total number of task is 6 ;
		for(int i=0; i<2; i++) {
			Ayush a = new Ayush(t);
			exe.execute(a);
		}

		
		exe.shutdown();
		
	}

}

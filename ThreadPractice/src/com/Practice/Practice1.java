package com.Practice;




public class Practice1 {
	
	public static void main(String[] args) {
		
		System.out.println("HI is executed by Thread -> "+ Thread.currentThread().getName());
		
		Thread.currentThread().setName("Ayush-Thread");
		
		System.out.println("Now HI is executed by Thread -> "+ Thread.currentThread().getName());
		
		
		System.out.println("The id of Ayush-Thread is -> "+ Thread.currentThread().getId());
		
		
		System.out.println("Thread name is " + Thread.currentThread().getName()+ " and the id is "+ Thread.currentThread().getId());
		
		System.out.println("Priority of thread-> "+ Thread.currentThread().getName() + " is ->" + Thread.currentThread().getPriority());
		
		System.out.println("max priority ->" + Thread.currentThread().MAX_PRIORITY);
		System.out.println("min priority -> "+ Thread.currentThread().MIN_PRIORITY);
		System.out.println("Norm priority ->" + Thread.currentThread().NORM_PRIORITY);
		Thread.currentThread().setPriority(9);
		
		System.out.println("new priority of " + Thread.currentThread().getName() + " is ->" + Thread.currentThread().getPriority());
		
		
		
		
	}

}

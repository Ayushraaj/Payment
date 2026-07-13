package com.MultiThreading;

//getName, setName , getId, setPriority, getPriority, activeCount,
//isAlive, sleep, getThreadGroup.getName, MIN_PRIORITY, NORM, MAX
// getThreadGroup.getParent.getName





public class MultiThreading {
	
	public static void main(String[] args)  {
		
		System.out.println("executed by -> " + Thread.currentThread().getName());
		
		System.out.println("Setting the new name of the main thread to Ayush");
		
		Thread.currentThread().setName("Ayush");
		
		System.out.println("The new name of the main thread is -> " + Thread.currentThread().getName());
		
		System.out.println("Checking the thread id");
		System.out.println("The main thread (AYUSH) ID is -> " + Thread.currentThread().getId());
		
		
		System.out.println("-------------------");
		
		System.out.println("Thread name " + Thread.currentThread().getName() + " Priority of the Thread Ayush is "
				+ Thread.currentThread().getPriority());
		
		System.out.println(" checking the priority for the Ayush THREAD ");
		
		System.out.println(Thread.currentThread().getName()+ " Thread Max_priority is  " + Thread.currentThread().MAX_PRIORITY);
		
		System.out.println(Thread.currentThread().getName()+ " Thread Min_priority is " + Thread.currentThread().MIN_PRIORITY);
		
		System.out.println(Thread.currentThread().getName() + " Thread Norm_priority is " + Thread.currentThread().NORM_PRIORITY);
		
		
		System.out.println("----------------------------");
		System.out.println("Setting a new thread Priority for Ayush Thread ");
		
		Thread.currentThread().setPriority(10);
		
		System.out.println("The new thread priority for Ayush Thread is -> " + Thread.currentThread().getPriority());
		
		System.out.println("creating a new thread and checking thread group for Ayush(main thread) and the new thread");
		
		
		Thread t = new Thread();
		
		System.out.println("The new thread is -> " + t.getName());
		
		System.out.println("I have two threads now " + " one is -> " + Thread.currentThread().getName() + " Another one is -> " + t.getName());
		
		System.out.println("Checking the thread group for these two threads");
		
		System.out.println("The thread group for Ayush thread is -> " + Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("The thread group for Thread-0 is -> "+ t.getThreadGroup().getName());
		
		
		
		System.out.println("Parent thread group of Ayush -> " + Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		
	}
}

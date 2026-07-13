package com.Thread;

import java.util.concurrent.*;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;


class Ayush implements Callable<Integer>{
	
	// we cannot pass any parameter inside call(a, b) 
	public Integer call()  throws InterruptedException {
		
		int a =10;
		int b =4;
		int sum = a+b;
		Thread.sleep(5000);
		
		System.out.println("executed by thread -> " + Thread.currentThread().getName());
		return sum;
		
		
	}
}


public class Callablee {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Ayush a = new Ayush();
		
		System.out.println("Waiting for future response");
		Future<Integer> ans =executorService.submit(a);
		
		
		System.out.println(ans.get());// acts as a blocking/ waiting for the result
		System.out.println("Got the response from the future object");
		
		executorService.shutdown();
		
	}
	
}

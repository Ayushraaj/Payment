package com.Thread;

import java.util.concurrent.*;


class Pay implements Callable<String>{
	
	public String call() {
		
		
			return " number is executed by -> " + Thread.currentThread().getName();
		
	}
}

public class Exceutor {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		
		// reusable thread
		ExecutorService executors = Executors.newFixedThreadPool(6);
		
		
		//30 tasks  , 6 threads
		for(int i=0; i<30; i++) {
			
			Pay pay = new Pay();
			//executors.execute(pay);
			Future<String> ans = executors.submit(pay);
			System.out.println(ans.get() + " number is -> " + i);
			
		}
		
		executors.shutdown();
	}

}

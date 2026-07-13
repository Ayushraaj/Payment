package com.beans;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeUsers implements Netflix {
	
	ArrayList<String> user = new ArrayList<String>();
	
	
	public void insertUsers() {
		Netflix.greetingMsg();
		System.out.println("Enter how many Users you want to insert");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();
		
	
		for(int i=0; i<number; i++) {
			
			System.out.println("Please provide me the name of user"+i);
			String name = sc.nextLine();

			
			user.add(name);
		}
	}
	
	public void viewAllUsers() {
		
		System.out.println("All Netflix Users are listed below....");
		
		user.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		
	}
	
	
	public void primeUsers() {
		
		System.out.println("Prime users have name Length more than 5");
		System.out.println("All Netflix prime users are listed below");
		
		user.stream().filter(name -> name.length()>4).forEach(name -> System.out.println(name));
		
	}
	
	public void nonPrimeUsers() {
		

		System.out.println("All Netflix Non-Prime users are listed below");
		
		user.stream().filter(name -> name.length()<4).forEach(name -> System.out.println(name));
		
	}

}

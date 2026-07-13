package com.beans;

import org.springframework.beans.factory.annotation.Value;

public class PrimeUsers implements Netflix {
	@Value("Ayush")
	private String UserName;
	
	private String recentWatchedMovie;
	private String MovieType;
	
	public PrimeUsers(String recentWatchedMovie, String MovieType) {
		
		//this.UserName = UserName;
		this.recentWatchedMovie= recentWatchedMovie;
		this.MovieType=MovieType;
	}
	
	
	public void PrimeMember() {
		
		System.out.println("This is a Prime User");
		System.out.println("----------------");
		System.out.println("UserName: " + UserName);
		System.out.println("Recent-Watched-Movie: "+ recentWatchedMovie);
		System.out.println("Movie-Type: " + MovieType);
		
	}
	

}

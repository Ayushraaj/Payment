package com.beans;

public class NonPrimeUsers implements Netflix {
	
	private String UserName;
	private String recentWatchedMovie;
	private String MovieType;
	
	public NonPrimeUsers(String UserName, String recentWatchedMovies, String MovieType) {
		this.UserName= UserName;
		this.recentWatchedMovie = recentWatchedMovies;
		this.MovieType= MovieType;
	}
	
	public void NonPrimeMember() {
		
		System.out.println("This is a Non-Prime USER");
		System.out.println("UserName: " + UserName);
		System.out.println("Recent-Watched-Movie: "+ recentWatchedMovie);
		System.out.println("Movie-Type: "+ MovieType);
	}

}

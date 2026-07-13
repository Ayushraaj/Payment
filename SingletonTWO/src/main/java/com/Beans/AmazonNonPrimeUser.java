package com.Beans;



public class AmazonNonPrimeUser implements AmazonPrime {
	
	private String name;
	private String lastWatchedMovie;
	private double rating;
	private String movieType;
	private String movieBelongsTo;
	private String description;
	
	
	public AmazonNonPrimeUser(String name, String lastWatchedMovie, double rating,
			String movieType, String movieBelongsTo, String description) {
		
		this.name = name;
		this.lastWatchedMovie = lastWatchedMovie;
		this.rating= rating;
		this.movieType = movieType;
		this.movieBelongsTo = movieBelongsTo;
		this.description = description;
		
		
	}
	
	
	public void  NonPrimeMember() {
		System.out.println( "AmazonPrimeUser [name=" + name + ", lastWatchedMovie=" + lastWatchedMovie + ", rating=" + rating
				+ ", movieType=" + movieType + ", movieBelongsTo=" + movieBelongsTo + ", description=" + description
				+ "]");
	}

}

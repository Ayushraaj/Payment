package com.beans;

public class Book {

	private String bookName;
	private int price;
	private String authorName;
	private String description;
	private boolean isAvailable;
	
	
	public Book(String bookName, int price, String authorName, String description, boolean isAvailable) {
		this.bookName = bookName;
		this.price = price;
		this.authorName= authorName;
		this.description = description;
		this.isAvailable = isAvailable;
		
	}


	
	public void bookDetails() {
		System.out.println( "Book [bookName=" + bookName + ", price=" + price + ", authorName=" + authorName + ", description="
				+ description + ", isAvailable=" + isAvailable + "]");
	}
	
}

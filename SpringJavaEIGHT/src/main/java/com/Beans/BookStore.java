package com.Beans;


public class BookStore {
	
	private String bookName;
	private String authorName;
	private String description;
	private boolean isAvailable;
	private int price;
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
		
	}
	
	public void setAuthorName(String authorName) {
		this.authorName= authorName;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public String getDescription() {
		return description;
	}
	public boolean getAvail() {
		return isAvailable;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public void bookDetails() {
		System.out.println("Book Name: "+ getBookName());
		System.out.println("Author Name: "+ getAuthorName());
		System.out.println("Description: "+ getDescription());
		System.out.println("isAvailable: "+ getAvail());
		System.out.println("Price: "+ getPrice());
		
	}
	
	
	
	
	

}

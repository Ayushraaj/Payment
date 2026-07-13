package com.springe2e.request;


public class ProductRequest {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String productName;
	private int productPrice;
	private String productAgencyName;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductAgencyName() {
		return productAgencyName;
	}
	public void setProductAgencyName(String productAgencyName) {
		this.productAgencyName = productAgencyName;
	}
	
	

}

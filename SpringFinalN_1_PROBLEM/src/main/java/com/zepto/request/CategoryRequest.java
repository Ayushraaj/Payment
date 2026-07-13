package com.zepto.request;

import java.util.List;

public class CategoryRequest {
	private String categoryName;
	private String status;
	
	private List<ProductRequest>  productRequests;
	
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ProductRequest> getProductRequests() {
		return productRequests;
	}
	public void setProductRequests(List<ProductRequest> productRequests) {
		this.productRequests = productRequests;
	}
	
	
}

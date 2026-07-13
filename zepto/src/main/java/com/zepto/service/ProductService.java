package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.ProductEntity;
import com.zepto.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public String createSingleProduct(String productName, int productPrice) {
		
		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductName(productName);
		productEntity.setProductPrice(productPrice);
		
		productRepo.save(productEntity);
		
		System.out.println("Your product has been created...");
		return "Product with, ProductName: "+ productName+", ProductPrice: "+ productPrice +", is created";
	}
	
	
	public String findProducts(String productName) {
		
		ProductEntity product = productRepo.findByProductName(productName);
		
		if(product==null) {
			
			System.out.println("This product is not available in the db");
			
		}
		
		if(productName.equals(product.getProductName())) {
			System.out.println("This product is exist in the db");
			int product_price =product.getProductPrice();
			int product_id = product.getId();
			
			System.out.println("Product id:"+product_id+" , Product Price: "+ product_price);
		}
		return "Your Product "+ productName + ", is available in the db";
		
	}
	
	
	public String deleteProductByName(String productName) {
		
		ProductEntity product = productRepo.findByProductName(productName);
		
		if(product==null) {
			System.out.println("Product with the name: "+ productName + ", does not exist");
			
		}
		
		if(productName.equals(product.getProductName())) {
			int product_id = product.getId();
			
			productRepo.deleteById(product_id);
			System.out.println("Product has been successfully deleted from the db");
		}
		
		return "Your Product "+ productName + ", has been deleted Successfully";
	}
	
	
	

}

package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.request.ProductRequest;
import com.zepto.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/create")
	public String createProduct(@RequestBody ProductRequest request) {
		
		System.out.println("Inside the create product controller");
		
		String productName = request.getProductName();
		int productPrice = request.getProductPrice();
		
		return productService.createSingleProduct(productName, productPrice);
		
		
		
		
		
	}
	
	@PostMapping("/findProducts/{productName}")
	public String findProducts(@PathVariable("productName") String productName) {
		
		return productService.findProducts(productName);
	}
	
	@PostMapping("/deleteProduct/{productName}")
	
	public String deleteProduct(@PathVariable("productName") String prodctName) {
		
		return productService.deleteProductByName(prodctName);
	}

}

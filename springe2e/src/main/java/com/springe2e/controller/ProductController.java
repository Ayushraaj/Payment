package com.springe2e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springe2e.request.ProductRequest;
import com.springe2e.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/createSingleProduct")
	public String createProduct(@RequestBody ProductRequest req) {
		
		System.out.println("Inside the singleProduct create controller");
		
		String productName = req.getProductName();
		int productPrice = req.getProductPrice();
		
		String productAgencyName = req.getProductAgencyName();
		
		return productService.createProduct(productName, productPrice, productAgencyName);
	}
	
	
	@PostMapping("/findSingleProduct/{productName}")
	public String findSingleProduct(@PathVariable("productName") String productName) {
		
		System.out.println("Inside the controller findSingleProduct Method...");
		
		return productService.findSingleProduct(productName);	
		
	}
	
	@GetMapping("/getAllProduct")
	public String getAllProducts() {
		
		System.out.println("Inside the getAllProduct controller method..");
		
		return productService.getAllProducts();
	}
	
	// updaating productName
	
	@PostMapping("/updateProducts")
	public String updateProductName(@RequestBody ProductRequest req) {
		
		
		System.out.println("Inside the updateProductName controller method");
		
		int userId = req.getId();
		String productName = req.getProductName();
		return productService.updateName(userId,productName);
	}
	

}

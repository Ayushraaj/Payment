package com.springe2e.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springe2e.entity.ProductEntity;
import com.springe2e.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	
	public String createProduct(String productName, int productPrice, String productAgencyName) {
		
		
		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductName(productName);
		productEntity.setProductPrice(productPrice);
		productEntity.setProductAgencyName(productAgencyName);
		
		productRepo.save(productEntity);
		
		
		
		
		
		System.out.println("ProductName: "+ productName);
		System.out.println("ProductPrice: "+ productPrice);
		System.out.println("ProductAgencyName: "+ productAgencyName);
		return "Your product has been create successfully";
	}
	
	
	
	public String findSingleProduct(String productName) {
		
		ProductEntity isProduct = productRepo.findByProductName(productName);
		
		if(isProduct==null) {
			System.out.println("Pls provide the product Name");
		}
		
		if(productName.equals(isProduct.getProductName())) {
			System.out.println("Product with the ProductName: "+ productName + ", is available in the db");
		}
		else {
			
			System.out.println("Product With the given ProductName: "+ productName + ", is not available in the db");
		}
		
		return "Go and check your system console........";
				
	}
	
	public String getAllProducts() {
		
		List<ProductEntity> product = productRepo.findAll();
		
			
		product.stream().forEach(productName-> System.out.println(productName.getProductName()));
		
		
		
		return "DB productName are available in the system console....";
	}
	
	
	public String updateName(int userId, String productName) {

	    Optional<ProductEntity> optional = productRepo.findById(userId);

	    if(optional.isPresent()) {

	        ProductEntity productEntity = optional.get();

	        productEntity.setProductName(productName);

	        productRepo.save(productEntity);

	        System.out.println("ProductName has been updated");

	    } else {

	        System.out.println("User with id " + userId + " does not exist in the DB");

	    }

	    return "Check your system console and DB";
	}

}

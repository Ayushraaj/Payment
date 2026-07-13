package com.springe2e.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springe2e.entity.ProductEntity;
import com.springe2e.repository.ProductRepo;

@Service
@Profile("test")
public class TestProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	
	
	
	public String checkLength() {

	    List<ProductEntity> allProducts = productRepo.findAll();

	    List<ProductEntity> products = allProducts.stream()
	            .filter(p -> p.getProductName().length() > 4)
	            .toList();

	    for (ProductEntity p : products) {

	        

	        System.out.println(" Products is : " + p.getProductName());
	    }

	    return "Check your DB and system console.";
	}
	
	public String deleteLength() {

	    List<ProductEntity> allProducts = productRepo.findAll();

	    List<ProductEntity> products = allProducts.stream()
	            .filter(p -> p.getProductName().length() > 4)
	            .toList();

	    for (ProductEntity p : products) {

	        productRepo.delete(p);

	        System.out.println("Deleted Product : " + p.getProductName());
	    }

	    return "Check your DB and system console.";
	}

}

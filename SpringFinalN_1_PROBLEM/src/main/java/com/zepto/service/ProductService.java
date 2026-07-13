package com.zepto.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepository;
import com.zepto.request.CategoryRequest;
import com.zepto.request.ProductRequest;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public long createProduct(CategoryRequest categoryRequest) {
		CategoryEntity categoryEntity  = categoryRepository.findByCategoryName(categoryRequest.getCategoryName());
		
		if(categoryEntity == null) {
			categoryEntity = new CategoryEntity();
			categoryEntity.setCategoryName(categoryRequest.getCategoryName());
			categoryEntity.setStatus("Active");
		}
		
		List<ProductRequest> productRequests = categoryRequest.getProductRequests(); // request
		List<ProductEntity> productEntities = new ArrayList<ProductEntity>(); //entity
		
		for (ProductRequest request : productRequests) {
			ProductEntity productEntity = new ProductEntity();
			
			productEntity.setProductName(request.getProductName());
			productEntity.setDescription(request.getDescription());
			productEntity.setPrice(request.getPrice());
			productEntity.setQuantity(request.getQuantity());
			
			productEntity.setCategories(categoryEntity);
			productEntities.add(productEntity);
		}
		
		categoryEntity.setProducts(productEntities);
 	    CategoryEntity saved = categoryRepository.save(categoryEntity);
 	    return saved.getCategory_id();
	}
	
	
	
//	@Transactional
	public void getAllDataUsing() {
		
		List<CategoryEntity> entities = (List<CategoryEntity>) categoryRepository.findAll();
		System.out.println("I am loading category...(PARENT)");
		for (CategoryEntity categoryEntity : entities) {
			
			System.out.println("Name: " +categoryEntity.getCategoryName() + " Status: " + categoryEntity.getStatus());
			
//			System.out.println("I am loading product.....(CHILD)");
//			for(ProductEntity entity : categoryEntity.getProducts()) {
//				System.out.println("Product Name: " +entity.getProductName() + " Discreption: " + entity.getDescription() + " Product ID: " +entity.getProd_id());
//			}
		}  
	}
}

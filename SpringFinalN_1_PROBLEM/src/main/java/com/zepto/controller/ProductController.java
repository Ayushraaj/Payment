package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.request.CategoryRequest;
import com.zepto.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("saveProduct")
	@ResponseBody
	public String creatListOfProducts(@ModelAttribute CategoryRequest categoryRequest) {
		long saved = productService.createProduct(categoryRequest);

		return "Saved successfully with category ID: " + saved;
	}
	
	@GetMapping("getAll")
	@ResponseBody
	public void getAllCategories() {
		
		productService.getAllDataUsing();
		
	}
}

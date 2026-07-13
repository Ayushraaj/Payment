package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AmazonProducts {
	
	@GetMapping("/amazon")
	public String getAmazon() {
		System.out.println("Inside the get amazon method");
		return "amazon-page";
	}
	
	
	
	@GetMapping("/amazonInfo/{productName}/{quantity}")
	@ResponseBody
	public String amazonInfo(@PathVariable("productName") String name, 
			@PathVariable("quantity") String quantity
			) {
		
		System.out.println("Inside amazon Info method");
		return "Product Name: "+ name+ ",  Quantity "+ quantity + " ";
	}

}

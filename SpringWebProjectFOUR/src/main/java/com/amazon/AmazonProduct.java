package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class AmazonProduct {
	
	@GetMapping("/search")
	public String searchProduct() {
		
		System.out.println("I am inside the controller class");
		return "amazon-page";
	}
	
	
	@GetMapping("/searchProduct")
	@ResponseBody
	public String searched(@RequestParam("searchText") String name) {
		
		System.out.println("this is your searched Product: "+ name);
		return "The searched Product is: "+ name+ " ";
	}

}

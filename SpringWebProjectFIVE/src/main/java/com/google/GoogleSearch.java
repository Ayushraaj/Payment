package com.google;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoogleSearch {
	
	@GetMapping("search")
	public String Search() {
		
		System.out.println("Inside the controller.........");
		return "page";
		
	}
	
	@GetMapping("searchProduct")
	@ResponseBody
	public String Searched(@RequestParam("find") String name) {
		
		
		return "Your search product is: " + name + " ";
		
	}

}

package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RapidoController {
	
	
	@GetMapping("/login")
	public String login() {
		System.out.println("LOGIN-----------");
		return "loginPage";
	}

}

package com.francalino.frankley.springsecurehelloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	@GetMapping
	public String sayHello() {
		
		return "Hello World!";
		
	}

}

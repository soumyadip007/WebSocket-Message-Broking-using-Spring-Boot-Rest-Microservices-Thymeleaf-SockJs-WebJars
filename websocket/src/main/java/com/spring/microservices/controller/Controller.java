package com.spring.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/test")
	public String test() {
		return "i.html";
	}
}

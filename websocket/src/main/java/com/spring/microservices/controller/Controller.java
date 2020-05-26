package com.spring.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/kafka-websocket")
	public String test() {
		return "index.html";
	}
}

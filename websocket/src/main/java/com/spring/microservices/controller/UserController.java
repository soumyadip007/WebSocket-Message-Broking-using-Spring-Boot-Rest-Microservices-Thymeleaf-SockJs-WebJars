package com.spring.microservices.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.spring.microservices.model.UserResponse;

@Controller
public class UserController {

	@MessageMapping("/user")
	@SendTo("/topic/user")
	public UserResponse getUser(User user) {
		
		return new UserResponse(user.getName());
	}
}

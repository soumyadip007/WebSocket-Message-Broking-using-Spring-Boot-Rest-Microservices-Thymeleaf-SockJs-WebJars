package com.spring.microservices.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.spring.microservices.model.User;
import com.spring.microservices.model.UserResponse;

@Controller
public class UserController {


    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
    	System.out.println("TEST");
    	System.out.println("TEST");
    	System.out.println("TEST");
    	System.out.println("TEST");
    	System.out.println("TEST");
    	System.out.println(user.getName());
    	System.out.println(user.getName());
    	System.out.println(user.getName());
    	System.out.println(user.getName());
    	System.out.println(user.getName());
    	System.out.println(user.getName());
    	System.out.println(user.getName());
        return new UserResponse("Hi " + user.getName());
    }
}
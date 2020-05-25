package com.spring.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.spring.microservices.model.User;
import com.spring.microservices.model.UserResponse;

@Controller
public class UserController {


    @Autowired
    SimpMessagingTemplate template;

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
    	
        template.convertAndSend("/topic/user", new UserResponse("From Autowiring"));
      
        return new UserResponse("Hi " + user.getName());
    }
    
    
    
}
package com.spring.microservices.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.spring.microservices.model.UserResponse;

@Service
public class ConsumerController {

	 @Autowired
	 SimpMessagingTemplate template;

	@KafkaListener(topics="Kafka_String", group = "group_id")
	public void ConsumeString(String msg) {
		
		template.convertAndSend("/topic/user", new UserResponse(msg));
	      
		System.out.println(msg);
	}

}

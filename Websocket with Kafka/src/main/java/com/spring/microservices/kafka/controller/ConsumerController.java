package com.spring.microservices.kafka.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerController {

	@KafkaListener(topics="Kafka_String", group = "group_id")
	public void ConsumeString(String msg) {
		System.out.println(msg);
	}

}

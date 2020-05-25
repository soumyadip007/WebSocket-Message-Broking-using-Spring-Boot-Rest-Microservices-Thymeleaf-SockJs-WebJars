package com.spring.microservices.websocket.config;

import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer  {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/websocket").withSockJS();
	}

}

package com.spring.microservices.model;

public class UserResponse {

	private String content;

	public UserResponse(String string) {
		this.content=string;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}

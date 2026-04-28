package com.global.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String name; 
	private int age; 
	@JsonProperty("isDeveloper")
	private boolean isDeveloper; 
	
	//기본 생성자 (필수)
	public User() {
	}

	//생성자, Getter, Setter
	public User(String name, int age, boolean isDeveloper) {
		this.name = name; 
		this.age = age; 
		this.isDeveloper = isDeveloper;
	}
	public String getName() { return name; }
	public int getAge() { return age; }
	public boolean isDeveloper() { return isDeveloper; }
}

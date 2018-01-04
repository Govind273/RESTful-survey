package com.in28minutes.springboot.jpa;

public class User {

	private long id;
	private String name;
	private int age;
	private String role;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + "]";
	}
	
}

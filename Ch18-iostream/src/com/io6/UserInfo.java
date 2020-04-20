package com.io6;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	String name;
	transient String password;
	int age;
	
	
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public UserInfo() {
		this("Unknown", "qwerty", 0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+name + ", " + password + ", " + age + ")";
	}
	
}

package com.io6;

import java.io.Serializable;

public class Customer implements Serializable {

	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Your name is" + name;
	}
	
	
	
}

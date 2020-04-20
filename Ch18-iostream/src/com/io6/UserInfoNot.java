package com.io6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperUserInfo{
	String name;
	String password;
	public SuperUserInfo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public SuperUserInfo() {
		this("Unknown", "1111");
	}
	
}


public class UserInfoNot extends SuperUserInfo 
	implements Serializable{

	int age;
	
	public UserInfoNot() {
		this("Unknown", "111", 0);
	}

	public UserInfoNot(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + name + ", " + password + ", " + age + ")";
	}
	
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, Exception {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
	
	
	
	
	
}

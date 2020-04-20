package com.set;

import java.util.HashSet;

class Human{
	String name;
	int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + age;
	}
}

public class HashSetEx06 {

	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		
		hashset.add("a");
		hashset.add("a");
		hashset.add("b");
		hashset.add("b");
		hashset.add(new Human("a",30));
		hashset.add(new Human("a",30));
		hashset.add(new Human("b",30));
		hashset.add(new Human("b",30));
		
	}

}

package com.tree;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
//	need to override from every interface method
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showData() {
		System.out.println(name+age);
	}

	@Override
	public int compareTo(Person person) {
		if(age>person.age) {
			return 1;
		}else if(age<person.age) {
			return -1;
		}else {
			return 0;
		}
	}
}

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<Person> treeset=new TreeSet<Person>();
//		input the Person object into TreeSet material type
		
		treeset.add(new Person("a", 1));
		treeset.add(new Person("b", 2));
		treeset.add(new Person("c", 3));
		treeset.add(new Person("d", 4));
		
		Iterator<Person> iterator=treeset.iterator();
//		Person elements is executed circuit within treeset.iterator
		
		while(iterator.hasNext()) {
			iterator.next().showData();
		}
		
	}

}

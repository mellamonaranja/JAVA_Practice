package com.set;

import java.util.HashSet;

class HumanDiff{
	String name;
	int age;
	public HumanDiff(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HumanDiff) {
//			if obj is belong to HumanDiff
			HumanDiff humandiff=(HumanDiff)obj;
//			obj has been down casting to HumanDiff type and put to humandiff
			return name.equals(humandiff.name)&&age==humandiff.age;
		}
		return false;
	}
	
	
}

public class HashSetEx07 {

	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		
		hashset.add("a");
		hashset.add("a");
		hashset.add("b");
		hashset.add("b");
		hashset.add(new Human("a",30));
		hashset.add(new Human("a",30));
		hashset.add(new Human("b",30));
		hashset.add(new Human("b",30));

		System.out.println(hashset);
	}

}

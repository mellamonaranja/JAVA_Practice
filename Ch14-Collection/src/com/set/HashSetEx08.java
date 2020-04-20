package com.set;

import java.util.HashSet;

class Animal{
	String species;
	String habitant;
	
	public Animal(String species, String habitant) {
		super();
		this.species = species;
		this.habitant = habitant;
	}

	@Override
	public int hashCode() {
		return (species+habitant).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal animal=(Animal)obj;
			
			return species.equals(animal.species)&&habitant.contentEquals(animal.habitant);
		}else {
			return false;
		}
			
	}
	
}

public class HashSetEx08 {

	public static void main(String[] args) {
		HashSet<Animal> hashset=new HashSet<Animal>();
		hashset.add(new Animal("cat", "land"));
		hashset.add(new Animal("cat", "land"));
		hashset.add(new Animal("cat", "land"));
		hashset.add(new Animal("dog", "land"));
		hashset.add(new Animal("dolphin", "sea"));
		hashset.add(new Animal("dolphin", "sea"));
		hashset.add(new Animal("dolphin", "sea"));
		
		System.out.println(hashset.size());
//		check the duplicate and doesn't count
//		because of comparison of contents upper(@Override)
	}

}

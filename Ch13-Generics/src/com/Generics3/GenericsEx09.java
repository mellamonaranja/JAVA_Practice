package com.Generics3;

import java.util.ArrayList;

class LandAnimal{
	public void crying() {
		System.out.println("Land Animal");
	}
}

class Cat extends LandAnimal{

	@Override
	public void crying() {
		System.out.println("Cat");
	}
}

class Dog extends LandAnimal{

	@Override
	public void crying() {
		System.out.println("Dog");
	}
}

class Dolphin{
	public void crying() {
		System.out.println("Dolphin");
	}
}


class AnimalList<T extends LandAnimal>{
	
	ArrayList<T> al = new ArrayList<T>();
	
	public static void wildAnimalList(
			AnimalList<? extends LandAnimal> al) {
		LandAnimal la = al.get(0);
		la.crying();
	}
	
	void add(T animal) {
		al.add(animal);
	}
	
	T get(int index){
		return al.get(index);
	}
	
	boolean remove(T animal) {
		return al.remove(animal);
	}
	
	int size() {
		return al.size();
	}
	
}


public class GenericsEx09 {

	public static void main(String[] args) {
		AnimalList<Cat> catList =
				new AnimalList<Cat>();
		
		catList.add(new Cat());
		
		
 
		AnimalList.wildAnimalList(catList);
		
		
		
		AnimalList<Dog> dogList =
				new AnimalList<Dog>();
		
		dogList.add(new Dog());
		
		

		AnimalList.wildAnimalList(dogList);
		
//		dogList.add(new Cat());
		
//		AnimalList<T extends LandAnimal>
//		AnimalList<Dolphin> dolphinList =
//				new AnimalList<Dolphin>();
		
	}

}

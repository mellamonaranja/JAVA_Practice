package com.Generics2;

import java.util.ArrayList;

class LandAnimal{
	public void crying() {
		System.out.println("land animal");
	}
}

class Cat extends LandAnimal{
	@Override
	public void crying(){
		System.out.println("mew");
		}
}

class Dog extends LandAnimal{
	@Override
	public void crying(){
		System.out.println("bowwow");
		}
}

class Dolphin{
	public void crying() {
		System.out.println("Dolphin");
	}
}

class AnimalList<T>{
	ArrayList<T> arraylist=new ArrayList<T>();
//	ArrayList has array and list functions
	
	void add(T animal) {
//		store animal in T type
		arraylist.add(animal);
//		and then add T type animal
	}
	
	T get(int index){
		return arraylist.get(index);
//		return the result to T type
	}
	
	boolean remove(T animal) {
		return arraylist.remove(animal);
	}
	
	int size() {
		return arraylist.size();
	}
}


public class GenericsEx07 {

	public static void main(String[] args) {

		AnimalList<LandAnimal> animal=new AnimalList<LandAnimal>();
//		??
//		generic can allow to declare only reference
//		therefore everything made by La vcxwes12dendAnimal
		
		animal.add(new LandAnimal());
		animal.add(new Cat());
		animal.add(new Dog());
//		animal.add(new Dolphin());
//		Dolphin cannot be stored because Dolphin isn't inherited
		
		for(int i=0;i<animal.size();i++) {
			animal.get(i).crying();
		}
		
	}

}

package com.Generics3;

import java.util.ArrayList;

class LandAnimal{
	public void crying() {
		System.out.println("land animal");
	}
}

class Cat extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("cat");
	}
}

class Dog extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("dog");
	}
}

class Dolphin{
	public void crying() {
		System.out.println("dolphin");
	}
}

class AnimalList<T extends LandAnimal>{
//	everything from LandAnimal can be put into T
	
	ArrayList<T> arraylist=new ArrayList<T>();
	
	public static void wildAnimalList(ArrayList<? extends LandAnimal> arraylist) {
//		?:any type can be input
//		extends LandAnimal : but only made by LandAnimal
		LandAnimal landanimal=arraylist.get(0);
//		index 0 is put into landanimal
		landanimal.crying();
	}
	
	void add(T animal) {
		arraylist.add(animal);
	}
	
	T get(int index){
		return arraylist.get(index);
	}
	
	boolean remove(T animal) {
		return arraylist.remove(animal);
	}
	
	int size() {
		return arraylist.size();
	}
}

public class GenericsEx09 {

	public static void main(String[] args) {
		AnimalList<Cat> catlist=new AnimalList<Cat>();
		
		catlist.add(new Cat());
//		AnimalList(ArrayList<? extends LandAnimal> arraylist)
//		whether inherited from LandAnimal or any class from ArrayList can be put to generic list
		AnimalList.wildAnimalList(catlist);
		
		AnimalList<Dog> doglist=new AnimalList<Dog>();
// 		declare Dog inherited from LandAnimal
//		and create new object which name is doglist
		
		doglist.add(new Dog());
//		AnimalList(ArrayList<? extends LandAnimal> arraylist)
//		AnimalList, Dog can be put into arraylist
		AnimalList.wildAnimalList(doglist);
		
//		AnimalList<T extends LandAnimal>
//		T type is only allowed from LandAnimal inherited
//		AnimalList<Dolphin> dolphinList = new AnimalList<Dolphin>();
//		Dolphin cannot be replaced to <T>type
		
		
	}

}
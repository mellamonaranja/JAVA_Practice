package com.Generics6;

class Fruit{
	public void showYou() {
		System.out.println("Fruit");
	}
}

class Apple extends Fruit{

	@Override
	public void showYou() {
		super.showYou();
		System.out.println("Apple");
	}
}

class FruitBox<T>{
	T item;

	public void store(T item) {
		this.item=item;
	}
	
	public T pullOut() {
		return item;
	}
	
}


public class GenericsEx14 {
	
	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
//		in ?, any type can be replaced but only inherited from Fruit or object of Fruit
		
		Fruit fruit = box.pullOut();
//		Fruit object can be returned here
		fruit.showYou();
		
	}

	public static void main(String[] args) {
		FruitBox<Fruit> fruitbox1 = new FruitBox<Fruit>();
//		2. FruitBox<Fruit> fruitbox1 = new FruitBox<Fruit>();
//		1. FruitBox<T> fruitbox1 = new FruitBox<T>();
		
		fruitbox1.store(new Fruit());
		
//		1. FruitBox<T> fruitbox2 = new FruitBox<T>();
		FruitBox<Apple> fruitbox2=new FruitBox<Apple>();
		
		fruitbox2.store(new Apple());
		
		openAndShowFruitBox(fruitbox1);
		openAndShowFruitBox(fruitbox2);
	}

}

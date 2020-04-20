package com.ext5;

class Product{
	
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}
	
	public String getName() {
		return "product";
	}
}

class Tv extends Product{

	public Tv() {
		super(100);
	}
	@Override
	public String getName() {
		return "Tv";
	}
}

class Computer extends Product{

	public Computer() {
		super(200);
	}
	
	@Override
	public String getName() {
		return "Computer";
	}
}

class Audio extends Product{

	public Audio() {
		super(300);
	}
	@Override
	public String getName() {
		return "Audio";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	public void buy(Product p) {
		if(money<p.price) {
			System.out.println("cannot buy with low balance");
			return;
//			when encounter return, terminate the current variable and go back to the place where calls buy method
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println("you bought "+p.getName());
	}
}

public class ExtendEx04 {

	public static void main(String[] args) {
		Buyer buyer1=new Buyer();
		Tv tv1=new Tv();
		Computer computer1=new Computer();
		Audio audio1=new Audio();
		
		System.out.println("current balance is "+ buyer1.money);
		System.out.println("the price of tv is "+ tv1.price);

		buyer1.buy(tv1);
		System.out.println("current balance is "+ buyer1.money);
		System.out.println("current bonusPoint is "+ buyer1.bonusPoint);
		
		System.out.println("the price of computer is "+ computer1.price);
		System.out.println("the price of audio is "+ audio1.price);
		

	}

}






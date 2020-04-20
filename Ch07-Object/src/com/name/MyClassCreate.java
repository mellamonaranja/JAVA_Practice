package com.name;

public class MyClassCreate {

	public static void main(String[] args) {
		
		Myclass mc1=new Myclass();
		Myclass mc2=new Myclass("이세영");
		Myclass mc3=new Myclass("이세영 누나", 33);
		Myclass mc4=new Myclass(18, "이세영 동생");
//		이렇게 정의한대로 호출해줘야 함(아래에서)
		
		System.out.println(mc1.getName()+","+mc1.getAge());
		System.out.println(mc2.getName()+","+mc2.getAge());
		System.out.println(mc3.getName()+","+mc3.getAge());
		System.out.println(mc4.getName()+","+mc4.getAge());
		
		

	}

}

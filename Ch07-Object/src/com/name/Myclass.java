package com.name;


public class Myclass {

	String name;
	int age;
	
	public Myclass() {
//		인자가 없는 이 생성자가 default생성자임
//		Myclass()는 생성자 method임. method overload가 가능함, 중복정의 가능함
		name = "codedragon";
		
	}
	
	public Myclass(String n) {
//	public Myclass와 이름은 같지만 signature가 다르기 때문에, 이렇게 생성 가능
		name=n;
}
	
	public Myclass(String n, int a) {
		name=n;
		age=a;
	}
	
	public Myclass(int a, String n) {
		name=n;
		age=a;
	}
		
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
		
	}
//	public과 같은 이름의 클래스는 public으로 만들어줘야 함
	
	}

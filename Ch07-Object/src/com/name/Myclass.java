package com.name;


public class Myclass {

	String name;
	int age;
	
	public Myclass() {
//		���ڰ� ���� �� �����ڰ� default��������
//		Myclass()�� ������ method��. method overload�� ������, �ߺ����� ������
		name = "codedragon";
		
	}
	
	public Myclass(String n) {
//	public Myclass�� �̸��� ������ signature�� �ٸ��� ������, �̷��� ���� ����
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
//	public�� ���� �̸��� Ŭ������ public���� �������� ��
	
	}

package com.name;

public class MyClassCreate {

	public static void main(String[] args) {
		
		Myclass mc1=new Myclass();
		Myclass mc2=new Myclass("�̼���");
		Myclass mc3=new Myclass("�̼��� ����", 33);
		Myclass mc4=new Myclass(18, "�̼��� ����");
//		�̷��� �����Ѵ�� ȣ������� ��(�Ʒ�����)
		
		System.out.println(mc1.getName()+","+mc1.getAge());
		System.out.println(mc2.getName()+","+mc2.getAge());
		System.out.println(mc3.getName()+","+mc3.getAge());
		System.out.println(mc4.getName()+","+mc4.getAge());
		
		

	}

}

package com.america;

//private<default<protected<public
//����Ŭ����<������Ű��<default+���<
public class Student {

	void getMessage() {
		System.out.println("American Student");
	}
	
	void interact() {
		Student instance=new Student();
		
		instance.getMessage();
		
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.getMessage();
		
		student.interact();

	}

}

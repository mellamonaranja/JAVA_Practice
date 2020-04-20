package com.america;

//private<default<protected<public
//현재클래스<동일패키지<default+상속<
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

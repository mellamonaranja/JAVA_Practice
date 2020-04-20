//private<default<protected<public
//클래스내부<동일패키지<default+상속<

package com.america;
// DTO class
public class MyClass {

	private int number;
//	정보 은닉화, number can be used only within this class
	public void setNumber(int num) {
		number=num;
//		setnumber : 데이터를 넣어주고
	}
	
	public int getNumber() {
//		캡슐화, private에 접근할 수 있도록
		return number;
	}
//	getnumber 데이터를 출력해주고
	
}

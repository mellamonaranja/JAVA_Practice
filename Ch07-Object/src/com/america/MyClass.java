//private<default<protected<public
//Ŭ��������<������Ű��<default+���<

package com.america;
// DTO class
public class MyClass {

	private int number;
//	���� ����ȭ, number can be used only within this class
	public void setNumber(int num) {
		number=num;
//		setnumber : �����͸� �־��ְ�
	}
	
	public int getNumber() {
//		ĸ��ȭ, private�� ������ �� �ֵ���
		return number;
	}
//	getnumber �����͸� ������ְ�
	
}

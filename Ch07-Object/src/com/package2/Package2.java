//package           class
//com.package1      PackOneIcecreamsandwich.java    �ٸ� ��Ű���ȿ� Ŭ���� ����
//com.package1      PackOneJellybeans.java          �ٸ� ��Ű���ȿ� Ŭ���� ����
//com.package2      PackTwoKitkat.java              ���� ��Ű���ȿ� Ŭ���� ����
//com.package2      PackTwoLollipop.java            ���� ��Ű���ȿ� Ŭ���� ����
//com.package2      PackageEx.java                  �� Ŭ����(�������� �ش��ϴ� ���� �Լ�)�� ���� ���� Ŭ���� ȣ���Ұ���
//                                                  ������ �׸��� �ٸ� ��Ű�� ���� Ŭ���� ȣ���Ұ���
package com.package2;

import com.package1.PackOneJellybeans;



public class Package2 {

	public static void main(String[] args) {
		com.package2.PackTwoKitkat p2k = new com.package2.PackTwoKitkat();
		
		System.out.println(p2k.str);
		
		PackTwoLollipop p21=new PackTwoLollipop();
		System.out.println(p21.str);
		
		com.package1.PackOneIcecreamsandwich p1i=new com.package1.PackOneIcecreamsandwich();
		
		System.out.println(p1i.msg);
		System.out.println(p1i.getStr());
		
		PackOneJellybeans p1j = new PackOneJellybeans();
		
		System.out.println(p1j.getStr());
	}

}

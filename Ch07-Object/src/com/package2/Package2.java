//package           class
//com.package1      PackOneIcecreamsandwich.java    다른 패키지안에 클래스 생성
//com.package1      PackOneJellybeans.java          다른 패키지안에 클래스 생성
//com.package2      PackTwoKitkat.java              같은 패키지안에 클래스 생성
//com.package2      PackTwoLollipop.java            같은 패키지안에 클래스 생성
//com.package2      PackageEx.java                  주 클래스(시작점에 해당하는 메인 함수)로 만든 다음 클래스 호출할거임
//                                                  ㄴ같은 그리고 다른 패키지 안의 클래스 호출할거임
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

package com.obj;

public class ObjectClassEx03 {

	public static void main(String[] args) {
		ObjectClassEx03 objectclass01=new ObjectClassEx03();
		System.out.println(objectclass01);

		ObjectClassEx03 objectclass02=new ObjectClassEx03();
		System.out.println(objectclass02);
		
		if(objectclass01==objectclass02) {
			System.out.println("objectclass01==objectclass02");
		}else {
			System.out.println("objectclass01!=objectclass02");
		}
		
		if(objectclass01.equals(objectclass02)) {
//			if don't override, the function .equals is just compare with reference value such as comparison '=='
			System.out.println("objectclass01==objectclass02");
		}else {
			System.out.println("objectclass01!=objectclass02");
		}
	}

}

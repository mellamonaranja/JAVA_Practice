package com.wrapperEx;

public class WrapperEx02 {

	public static void main(String[] args) {
		Integer obj1=new Integer(10);
		Integer obj2=20;
//		obj2 has been boxing automatically
		
		int sum=obj1.intValue()+obj2.intValue();
		System.out.println(sum);
		
		int result1=obj1*obj2;
//		obj1 and obj2 unboxing happened on them un-boxing automatically

		System.out.println(result1);
		
		Integer obj3=15;
		Integer obj4=20;
		
		Integer result2=obj3+obj4;
//		obj3 and obj4 have been auto boxing
		System.out.println(result2);
	}

}

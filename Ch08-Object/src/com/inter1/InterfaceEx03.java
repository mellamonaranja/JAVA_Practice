package com.inter1;

interface A{
	public static final int W=10;
//	declare 'public static final int' necessarily
	int X=20;
	static int Y=30;
	final int Z=40;
//	those 3 fields have same shape as ' public static final'
}

public class InterfaceEx03 implements A{

	public static void main(String[] args) {
		InterfaceEx03 inter03=new InterfaceEx03();
		System.out.println(A.W);
		System.out.println(A.X);
		System.out.println(A.Y);
		System.out.println(A.Z);
	}

}

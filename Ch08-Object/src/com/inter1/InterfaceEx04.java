package com.inter1;

import java.util.Scanner;
interface Week{
	int MON=1;
//	it omitted public static final before int
	int TUE=2;
	int WED=3;
	int THU=4;
	int FRI=5;
	int SAT=6;
	int SUN=7;
}

public class InterfaceEx04 implements Week{

	public static void main(String[] args) {
		
		System.out.println("input your favorite day> ");
		
		
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		
		switch(a) {
		
		case Week.MON:	
			System.out.println("��ó�� �����ϰ�, �Ѱ踦 �غ��ϴ� ��");
			break;
		case Week.TUE:	
			System.out.println("��ó�� ����������, ������ ȭ���ϴ� ��");
			break;
		case Week.WED:	
			System.out.println("��ó�� �ڿ�������. ������ �����ϴ� ��");
			break;
		case Week.THU:	
			System.out.println("����ó�� ����� ��ġ��. ���� ������ �ϴ� ��");
			break;
		case Week.FRI:	
			System.out.println("��ó�� ưư�ϰ�. ���� ������ �̺��ϴ� ��");
			break;
		case Week.SAT:	
			System.out.println("��ó�� �ε巴��. �����ؼ� �ϴ� ��");
			break;
		case Week.SUN:	
			System.out.println("��ó�� �����ϰ�. �Ƚ��ϴ� ��");
			break;
		}
		input.close();
	}

}

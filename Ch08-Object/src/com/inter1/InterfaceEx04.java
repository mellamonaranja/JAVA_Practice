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
			System.out.println("달처럼 차분하게, 한계를 극복하는 날");
			break;
		case Week.TUE:	
			System.out.println("불처럼 열정적으로, 사람들과 화합하는 날");
			break;
		case Week.WED:	
			System.out.println("물처럼 자연스럽게. 마음을 수양하는 날");
			break;
		case Week.THU:	
			System.out.println("나무처럼 생명력 넘치게. 몸을 깨끗이 하는 날");
			break;
		case Week.FRI:	
			System.out.println("쇠처럼 튼튼하게. 나쁜 습관과 이별하는 날");
			break;
		case Week.SAT:	
			System.out.println("흙처럼 부드럽게. 몰입해서 하는 날");
			break;
		case Week.SUN:	
			System.out.println("해처럼 찬란하게. 안식하는 날");
			break;
		}
		input.close();
	}

}

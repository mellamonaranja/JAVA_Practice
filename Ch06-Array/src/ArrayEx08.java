
public class ArrayEx08 {

	public static void main(String[] args) {
		
//		int [][]test;
//		test는 배열명이기도 하고 배열 참조형이기도 함
		
//		test = new int[2][3];
//		
//		test[0][0]=100;
//		test[0][1]=200;
//		test[0][2]=300;
//		
//		test[1][0]=400;
//		test[2][1]=500;
//		test[3][2]=600;
		
		int[][]test= {
				{100,200,300},
				{400,500,600}
		};
		
		System.out.println(test.length);
		System.out.println(test[0].length);
		System.out.println(test[1]);
//		2차원 배열의 1번째 array값
		
		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[i].length;j++) {
				System.out.println("test"+"["+i+"]"+"["+j+"]"+"="+ test[i][j]);
			
			}
			
			

		}
	}

}


public class ArrayEx08 {

	public static void main(String[] args) {
		
//		int [][]test;
//		test�� �迭���̱⵵ �ϰ� �迭 �������̱⵵ ��
		
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
//		2���� �迭�� 1��° array��
		
		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[i].length;j++) {
				System.out.println("test"+"["+i+"]"+"["+j+"]"+"="+ test[i][j]);
			
			}
			
			

		}
	}

}

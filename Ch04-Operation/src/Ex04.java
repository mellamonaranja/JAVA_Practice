
public class Ex04 {

	public static void main(String[] args) {
//		다중 for를 이용하여 구구단 프로그램 만들기
		
		for (int dan=1;dan<10;dan++) {
			System.out.print(dan + "단");
			for(int i=1;i<10;i++){
				System.out.print(dan + " X " + i + " = " + (dan*i) + "\t");
			}
			System.out.println();
			
		}
		
	}


	}



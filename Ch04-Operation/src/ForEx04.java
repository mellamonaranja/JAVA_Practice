
public class ForEx04 {

	public static void main(String[] args) {
		
//		for이용하여, 단에 해당하는 정수 하나를 입력받아, 해당 단의 구구단을 출력
//		
		int dan;
		
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.println("단 입력>");
//		'단 입력'출력
		
		dan=input.nextInt();
//		i입력 장치 완성		
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
			
		}
		
	

	}

}

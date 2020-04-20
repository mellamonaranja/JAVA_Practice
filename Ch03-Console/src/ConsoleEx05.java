import java.util.Scanner;


public class ConsoleEx05 {

	public static void main(String[] args) {
		
//		java.util.Scanner keyboard = new java.util.Scanner(System.in);
//		or (imported했기 떄문에)
		Scanner keyboard = new Scanner(System.in);
//		입력 장치를 만듦
//		Scanner를 오픈(new)했음
//		∴ 나중에 닫아줘야 함
		
		String name = keyboard.nextLine();
//		next로 읽어온 라인을 name이라는 문자열 변수에 저장
		
		System.out.println("안녕하세요"  + name +"님");
		
		boolean isTrue = keyboard.nextBoolean();
//		boolean 공간에 isTrue를 저장
		
		String msg = (isTrue)? "참값입니다." : "거짓입니다";
		System.out.println(msg);
		
		double num1 = keyboard.nextDouble();
//		Double형 데이터를 가져왔음-->실수형 데이터를 가져옴
		double num2 = keyboard.nextDouble();
		double diff = num1 - num2;
//		diff:차이
		
		if(diff>0) {
			System.out.println("당신이" + diff + "만큼 점수가 크군요");
			
			
		}else {
			System.out.println("당신이" + (-diff) + "만큼 점수가 작군요");

		}
		
		keyboard.close();
		

	}

}

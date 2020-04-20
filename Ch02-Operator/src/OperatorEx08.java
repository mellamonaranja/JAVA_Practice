
public class OperatorEx08 {
	
	public static void main(String [] args) {
		
		int a = 10;
		float b = 10.0f;
		
//		if(조건식:true) {
//		()안의 조건이 참인 경우에만 {}안을 수행
		
		if(a == b) {
//			a와 b타입이 같지 않음. a는 정수, b는 실수 
//			∴a가 자동으로 실수로 형변환돼서 실수와 실수로 연산되어짐
//			int가 float로 자동 변환되어짐
			
			
			System.out.println("a와 b는 같습니다.");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
			System.out.println("=======================");
			
			char c = '0';
//			1byte
//			캐릭터이므로 문자 0은 숫자로 처리됨
			int d = 0;
//			4byte
			
			System.out.println(c);
			System.out.println(d);
			
			
			if(c != d) {
//				char-->int로 변환해야 양자 비교가 가능
//				변환할 때는 앞에 (int)입력, 문자 0은 48의 결과가 나옴
				
				System.out.println("c와 d는 같지 않습니다.");
				System.out.println((int)c);
				System.out.println(d);
				
				char e = 'A';
				int f = 65;
				
				if(e == f) {
				System.out.println("e와 f는 같습니다.");	
				System.out.println(e);
				System.out.println((char)f);
				System.out.println((int)e);
					
				}
				
				
			}
			
		}
		
		
		
	}

}


public class WhileEx01 {

	public static void main(String[] args) {
		
		int num = 0;
//		인트형 num에 0값으로 초기화
		while(num<5) {
//			모든 while(반복문)은 초기식, 조건식, 증감식 3가지의 구성요소가 필요함
			
			System.out.println("I love JAVA - " + num);
//			I love JAVA 와 함께 num도 함께 출력
			
            num++;
//			증감식
//          5보다 작은 숫자까지 조건을 걸어줬으므로, 0부터 4까지가 출력됨
			
			
		}

	}

}

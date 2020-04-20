
public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int num = 10;
		do {
		System.out.println("I love JAVA- " + num);
		num++;
//		int에 num을 넣고 num을 0으로 초기화
//		I love JAVA를 출력할건데, num와 출력할 것임
//		num은 1씩 증가할거고, 반복할 것임
//		num은 7미만까지만 할거임
			
		}while(num<7);
//		이 조건이 맞지 않다 하더라도(num가 7보다 크다고 하더라도) 전체 조건은 한 번 실행된다
//		10을 넣으면 10이 출력되고, '반복문 종료 후 num : 11'을 출력 후 빠져나오게 된다
		
		System.out.println("반복문 종료 후 num : " + num);

	}

}

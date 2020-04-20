
public class DoWhileEx02 {

	public static void main(String[] args) {
		
		int su = 0;
		int num1 = 1;
		
		String msg = "Java World!";
//		msg라는 문자열 변수 만듦
		
		System.out.println("do~while 실행 결과");
		
		do {
			System.out.println(num1 + ":" + msg);
//			이 다음 num1값을 1증가시키도록 함
			num1++;
						
		}while(su++<5);
//		su가 5가 되거나 그 이상이 될 때 위 반복문은 빠져나오게 될 것임
		
		System.out.println("do~while수행 후 num1:" + num1);
		System.out.println("do~while수행 후 su:" + su);

		
		su = 0;
		int num2 = 1;
		
		System.out.println("While실행결과");
		while(su++<5) {
//			선연산(5와 비교) 후 1증가
//			su     1 2 3 4 5 6
//			num2   1 2 3 4 5 수행X
//			num2++ 2 3 4 5 6
			
			System.out.println(num2 + " : " + msg);
			num2++;
			System.out.println("do~while수행 후 num2:" + num2);
			System.out.println("do~while수행 후 su:" + su);

			
			
		}
		
	}

}

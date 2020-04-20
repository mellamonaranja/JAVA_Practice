
public class OperatorEx10 {
	
	public static void main(String [] args) {
		
		int n1 = 7;
		int result1 = 0;
		result1 = ++n1;
		
		System.out.println("result1 : " + result1);
		System.out.println("n1 : " + n1);
		
		int n2 = 7;
		int result2 = 0;
		result2 = --n2;
		System.out.println("result2 : " + result2);
		System.out.println("n2 : " + n2);
		
		int n3 = 7;
		int result3 = 0;
		result3 = n3++;
		System.out.println("result3 : " + result3);
//		연산에 참여 먼저
		System.out.println("n3 : " + n3);
//		+1
		
		int n4 = 7;
		int result4 = 0;
//		n값을 정확히 계산하기 위해 result값을 0으로
		result4 = n4--; //<--연산 수행문
		System.out.println("result4 : " + result4);
		System.out.println("n4 : " + n4); //<--여기서 적용(다음 라인)
		
//		증감연산자 후행일 시, 증가/감소값이 해당 연산 수행문에서는 미적용
//		다음 라인부터 적용
		
	}

}

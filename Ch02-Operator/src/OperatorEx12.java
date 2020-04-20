
public class OperatorEx12 {
	
	public static void main(String[] args) {
		
		System.out.println("논리곱");
		
		int a = 10;
		int b = 10;

//		boolean c = true && false;
//		true를 만드는 관계연산식 && false를 만드는 관계연산식
		boolean c = (a++ > ++b) && (++a > b++);
//		10 > 11 and 12 > 11 -->false
//		c=false
		
//		증가한 값은 이 다음 식부터 적용됨
		
		System.out.println("c: " + c);
		System.out.println("b: " + b);
		System.out.println("a: " + a);
//		(a++ > ++b)가 false기 때문에 
//		&& (++a > b++)는 true이건 false이건 계산 안 됨
//		∴a,b는 (a++ > ++b)여기서 계산된 11이 나옴
		
		int d = 10;
		int e = 10;
		
		boolean f = (++d > e++) || (d++ >= ++e);
//		(11 > 10(11)) or (11(12) > 12) -->true
//		(11 > 10(11))에서 d=11, e=11은 다음 항에서 적용됨
//		
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
//		true이기때문에, 후행을 계산 안 했음
//		∴d=11, e=11이 나옴
		
	}

}

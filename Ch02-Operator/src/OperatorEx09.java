
public class OperatorEx09 {
	public static void main(String []args) {
		
		int i1 = 5;
		int i2 = 5;
		
		System.out.println("증가연산자 선행: " + ++i1);
		System.out.println("i1 :" + i1);
		System.out.println("증가연산자 후행: " + i2++);
//		i2++ = i2+1 = (i2 += 1;) 
		System.out.println("i2 :" + i2);
		
				int j1 = 10;
		int j2 = 10;

		System.out.println("증가연산자 선행: " + --j1);
		System.out.println("j1 :" + j1);
//		j1이 9라는 값으로 계산되었기 때문에, 여기서는 9가 나옴
		System.out.println("증가연산자 선행: " + j2--);
		System.out.println("j2 :" + j2);
		
		
	}

}

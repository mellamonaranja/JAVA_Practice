
public class OperatorEx03 {
	public static void main(String [] args) {
		
		float f = 123.77777f;
		double d = 234.88888;
		
		System.out.println(f);
		System.out.println(d);
		
//		 %f : 실수일 경우, 서식을 지정(%)해서 f데이터를 출력하겠다
//		String.format("%f",f);
//		%f를 f로 포맷 변경
		
		String str1 = String.format("%.2f",f);
//		소수점 이하 둘째자리까지 포맷 지정
		System.out.println(str1);
		
		String.format("%.4f", d);
//		소수점 이하 넷째자리까지 보여라
		
		String str2 = String.format("%.4f", d);
		System.out.println(str2);
		
		
		
		
		
	}

}

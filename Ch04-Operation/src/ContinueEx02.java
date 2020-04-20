
public class ContinueEx02 {

	public static void main(String[] args) {
//		1~100까지 반복하면서, 3의 배수이거나 7의 배수인 수만 카운트하는 프로그램
//		3의 배수이거나 7의 배수인 수만 출력하고 카운트를 증가시키기

		int i = 0;
		int count = 0;
		while((i++)<=100) {
			if(i%3!=0 || i%7!=0) {
				continue;
			}
			System.out.println(i);
			count++;
		}
		System.out.println("count: " + count);
		
}
}

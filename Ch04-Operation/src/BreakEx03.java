
public class BreakEx03 {

	public static void main(String[] args) {
//	3의 배수이고 7의 배수인 정수를 찾는 프로그램 (1~100)
//		찾으면 더 이상 수행하지 않고 반복문을 빠져나옴
//		반복문을 빠져나온 후 찾은 정수를 출력하고, 찾지 못한 경우는 찾지 못했다고 출력
		int num = 1;
		boolean result = false;
		
		while(num<=10) {
			System.out.println(num);
			if(num%3==0 && num%7==0) {
				result = true;
				break;
			}
		}
	
}
}

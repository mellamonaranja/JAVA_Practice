
public class WhileEx02 {

	public static void main(String[] args) {
		int i = 10;
//		while에 사용할 변수를 i로 지정
		
		while(i>=0) {
//			System.out.println(i++);
//			이 상황에서는 조건이 없기 때문에 10이상의 값이 무한 반복됨
			System.out.println(i--);
//			선연산 후감소, 먼저 i를 출력하고 다음 라인부터 1씩 감소된 값 적용
		}
		System.out.println("후행 후 i: " + i);
		
		int j = 10;
		
		while(j>=0) {
			System.out.println(--j);
//			선감소 후 연산
		}
			System.out.println("선행 후 j: " + j);
			
		}

	}



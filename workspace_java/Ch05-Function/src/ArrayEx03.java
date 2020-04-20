
public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50, 60, 70};
//		{}로 배열 초기화는 선언시에만 가능함

		System.out.println("배열명 출력:" + a);
//		a에 저장된 주소값이 출력됨 : [I@372f7a8d
		System.out.println(a);
		
		char[] c = {'J','A'};
		System.out.println("배열명 출력:" + c);
//		이 배열의 참조값이 출력됨 : [C@2f92e0f4
		System.out.println(c);
//		배열명만 출력하게되면 이 배열이 가지고있는 모든 문자가 출력됨. 문!자!형!일!때!만!
//		c는 주소를 일컬음. 주소는 [C@2f92e0f4를 참조함
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
						
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
						
		}
		
	}

}

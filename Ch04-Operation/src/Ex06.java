
public class Ex06 {

	public static void main(String[] args) {
		// 아스키 코드표 출력 프로그램
//		0~127까지의 아스키 10진 값과 문자를 출력해주는 프로그램
//		예상 출력 결과 
//		100<tab> d
//		101<tab> e
//		제목을 20행마다 표시하기
//		10진수   아스키문자
		
		for(int i=0;i<128;i++) {
			if(i%20==0) {
			System.out.printf("10진수\t아스키문자\n)", i);
		}
		
		System.out.printf("%d\t%c\n", i, i);		
		
		
	}

}
}

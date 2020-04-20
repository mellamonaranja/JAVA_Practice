
public class FunctionEx09 {

	public static void main(String[] args) {
		showJava(3);
		
	}

	public static void showJava(int cnt) {
		
		System.out.println("JAVA" + cnt);
//		실행조건
		if(cnt==1) {
			return;
		}
//		종료조건=실행조건과 재귀조건 사이에 위치해야함, 그렇지않으면 무한루프에 빠짐
		
		showJava(--cnt);
//		재귀조건
		
	}
	
}
// 입력(cnt)에 대한 처리(int) 후 반환값(void)

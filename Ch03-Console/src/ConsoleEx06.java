
public class ConsoleEx06 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		입력장치 스캐너를 통해서 키보드로 입력
		
		String s1 = scanner.nextLine();
		System.out.println(s1);
//		nextLine으로 입력 받음
//		엔터 전 한 라인을(hello world) 입력받음(next line)
		
		String s2 = scanner.next();
//		입력장치를 통해 next를 통해 문자열을 가져와서 string s2에 담음
//		공백을 기준으로 한 단어 혹은 한 문자만(hello) 가져옴(next)
		System.out.println(s2);
		

	}

}

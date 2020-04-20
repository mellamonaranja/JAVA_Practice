
public class ConsoleEx10 {

	public static void main(String[] args) {
		
//		입력받기 : 입력받은 년도가 윤년인지 계산
//		4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
//		400으로 나누어 떠어지면 윤년
		
		int year;
//		연도 저장하기위한 변수 선언
				
		System.out.println("년도를 입력하세요>>");
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		year = scanner.nextInt();
//		스캐너로 가져온 값을 year에 저장
		System.out.println("년도 계산 중...");
		
//		String str (((year%4)==0) && (year%100)!=0) || ((year%400)==0))? "윤년입니다." : "윤년이 아닙니다." ;
		
//		System.out.printf("%d년은 %s, year, str);"
				
		boolean check = (((year%4)==0) && (year%100)!=0) || ((year%400)==0)? true : false ;
		
		if(check) {
			System.out.println("%d년은 윤년입니다., year");
		} else {
			System.out.println("%d년은 윤년이 아닙니다., year");
		}
		
	}

}

import java.util.Date;


public class ConsoleEx02 {

	public static void main(String []args) {
		
		Date now= new Date();
		
		System.out.printf("오늘은 %tY년 %tm월 %td일입니다.\n", now, now, now);
//		now,now,now순서대로 매핑해줘야 함
		System.out.printf("현재 %tH시 %tM분 %tS초입니다.\n", now, now, now);
		
		System.out.println(now);
		
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다.\n", now);		
		System.out.printf("현재 %1$tH시 %1$tM분 %1$tS초입니다.\n", now);
		
		
		
		
		
	}
}

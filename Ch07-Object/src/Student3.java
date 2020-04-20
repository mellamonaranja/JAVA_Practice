import java.util.Scanner;

public class Student3 {
	
	String name;
	int korean;
	int english;
	int math;
	
	public int getSum() {
		return korean + english + math;
	}

	public int getAvg() {
		return getSum()/3;
	}
	
	public void getPrint(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student3 student3 = new Student3();
//		Student3 라는 객체 생성
		
		student3.getPrint("이름 입력>");
		student3.name = input.nextLine();
//		String출력 시 input.nextLine(); 으로
		student3.getPrint("국어점수 입력>");
		student3.korean = input.nextInt();
		
		student3.getPrint("영어점수 입력>");
		student3.english = input.nextInt();
		
		student3.getPrint("수학점수 입력>");
		student3.math = input.nextInt();
		
		student3.getPrint("이름 :" + student3.name);
		student3.getPrint("국어 점수 :" + student3.korean);
		student3.getPrint("영어 점수 :" + student3.english);
		student3.getPrint("수학 점수 :" + student3.math);
		
		student3.getPrint("총점 : " + student3.getSum());
		student3.getPrint("평균 : " + student3.getAvg());
		input.close();
	}
	

}

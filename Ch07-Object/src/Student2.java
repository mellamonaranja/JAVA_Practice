
public class Student2 {

	String name;
	int korean;
	int math;
	int english;
	int sum;
	float avg;
	
	public int sum(int k, int m, int e) {
		return k+m+e;		
	}
	
	public int avg(int s) {
		return s/3;
	}
	
	
	public static void main(String[] args) {
	Student2 student = new Student2();	
//	객체 생성함

	student.name = "강남규";
	student.korean = 100;
	student.math = 90;
	student.english = 80;
//	멤버 변수
	
	student.sum = student.korean + student.math + student.english;
	student.sum = student.sum(student.korean, student.math, student.english);
	
	student.avg	= student.sum/3;
	student.avg = student.avg(student.sum);
	
	System.out.println("이름" + "\t" + "국어" + "\t" + "수학" + "\t" + "영어" + "\t" + "총점"+ "\t" + "평균");
	System.out.println(student.name + "\t" + student.korean + "\t" + student.math + "\t" + student.english 
			+ "\t" + student.sum + "\t" + student.avg);
		
	}

}

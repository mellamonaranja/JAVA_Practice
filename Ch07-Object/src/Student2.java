
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
//	��ü ������

	student.name = "������";
	student.korean = 100;
	student.math = 90;
	student.english = 80;
//	��� ����
	
	student.sum = student.korean + student.math + student.english;
	student.sum = student.sum(student.korean, student.math, student.english);
	
	student.avg	= student.sum/3;
	student.avg = student.avg(student.sum);
	
	System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����"+ "\t" + "���");
	System.out.println(student.name + "\t" + student.korean + "\t" + student.math + "\t" + student.english 
			+ "\t" + student.sum + "\t" + student.avg);
		
	}

}

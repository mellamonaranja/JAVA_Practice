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
//		Student3 ��� ��ü ����
		
		student3.getPrint("�̸� �Է�>");
		student3.name = input.nextLine();
//		String��� �� input.nextLine(); ����
		student3.getPrint("�������� �Է�>");
		student3.korean = input.nextInt();
		
		student3.getPrint("�������� �Է�>");
		student3.english = input.nextInt();
		
		student3.getPrint("�������� �Է�>");
		student3.math = input.nextInt();
		
		student3.getPrint("�̸� :" + student3.name);
		student3.getPrint("���� ���� :" + student3.korean);
		student3.getPrint("���� ���� :" + student3.english);
		student3.getPrint("���� ���� :" + student3.math);
		
		student3.getPrint("���� : " + student3.getSum());
		student3.getPrint("��� : " + student3.getAvg());
		input.close();
	}
	

}

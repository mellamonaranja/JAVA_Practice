
public class Ex01 {

	public static void main(String[] args) {
//		switch case�� �̿��Ͽ� ���ڿ� �񱳸� ���� ���� ����ϴ� ���α׷�
//		�������� ���� �Է� �� �ѱ۷ε� ������ ������ּ���
//		���ϴ� ������ �Է��ϼ���(���� �ҹ���) > 
		
	String s;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���ϴ� ������ �Է��ϼ���>");
		s=input.next();
//		s�� input�� ���� ������, ���� s=input.nextInt();�� �۵����� ���� 'Int'�� �����ؾ���
		
		switch(s) {
		case "monday":
		case "Monday":
            System.out.println("������");
			break;
		case "tuesday":
		case "Tuesday":
			System.out.println("ȭ����");
			break;	
		case "wednesday":
		case "Wednesday":
			System.out.println("������");
			break;	
		case "thursday":
		case "Thursday":
			System.out.println("�����");
		case "friday":
		case "Friday":
			System.out.println("�ݿ���");
		case "saturday":
			System.out.println("�����");
		case "sunday":
			System.out.println("�Ͽ���");		
		default : 
			System.out.println("��Ȯ�� ������ �Է��ϼ���>");
			break;
		}

	}

}

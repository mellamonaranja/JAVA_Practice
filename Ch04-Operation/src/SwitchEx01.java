
public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a;
//		a��� ���� ����(����� ��)
		System.out.println("������ ���ڸ� �Է��ϼ���. >");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		a = input.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1 �Է��Ͽ����ϴ�.");
			break;
//			case�� 1�̶�� break�������� ������ �����ϰ� ��. 
		case 2:
			System.out.println("2 �Է��Ͽ����ϴ�.");
			break;
		case 3:
			System.out.println("3 �Է��Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("4 �Է��Ͽ����ϴ�.");
			break;
		case 5:
			System.out.println("5 �Է��Ͽ����ϴ�.");
			break;
			default:
				System.out.println("1-5 �߿��� �Է��ϼ���.");
			break;
			
			
		
		}
		

	}

}


public class IfEx02 {

	public static void main(String[] args) {
	
		int a;
		a= 12;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
//				input�̶�� �̸����� 
		
		System.out.println("������ ������ �ϳ��� �Է����ּ���. >");
		
		a = input.nextInt();
		
		
		if(a%2==1) {
//		Ȧ���̸� {�� ����
			System.out.println("Ȧ���Դϴ�.");
	}else
//		�׷��� ������ else�� ����
		System.out.println("¦���Դϴ�.");
		
		System.out.println("���α׷� ����");}


}
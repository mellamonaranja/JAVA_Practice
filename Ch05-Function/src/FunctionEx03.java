
public class FunctionEx03 {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		int result = plus(3,7);
		System.out.println("3�� 7�� ��:" + result);
		System.out.println("3.5�� ����:" + square(3.5));
		byExit();
		
		
		System.out.println("���α׷� ��");

	}
	
	public static int plus(int num1, int num2) {
		int plusResult;
		plusResult = num1 + num2;
		return plusResult;
//		plusResult�� ���� ȣ���� ��(�� plus(3,7)���� ��ȯ��
//		�Է����� : (int num1, int num2)
//		������� : int
		
	}
	public static double square(double num) {
		return num*num;
//		double�� double�� �������� ��ȯ�Ǵ� �����͵� double��
//		�� public static �ڿ� double
				
	}
	public static void byExit() {
		System.out.println("���α׷� ����!!!");
	}

}


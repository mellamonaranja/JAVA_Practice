
public class FunctionEx04 {

	public static void main(String[] args) {
		dividedby(4,2);
		dividedby(4,0);
//		int�� 0���� �����Ⱑ �Ұ� arithmetic exception�߻�
		dividedby(6,2);
		dividedby(8,0);
		
		int returnResult = divide(6,2);
		System.out.println("���ϵ� ��: " + returnResult);
		
		returnResult = divide(6,0);
		System.out.println("���ϵ� ��: " + returnResult);
//		int result = 0;�̷��� �ʱ�ȭ�� ���� ������

	}
	
	public static void dividedby(int num1, int num2) {
		
		if(num2==0) {
			System.out.println("(�˸�)0������ ���� �� �����ϴ�");
			return;
//			���� �޼ҵ带 �����ϰ� �� ���Ͽ� �ִ� �ڵ�(System.out.println("������ ���:" + (num1/num2));)�� �������� �ʰ� �Լ� ȣ���� ��(dividedby(4,0);)���� ���α׷��� �帧�� �̵���Ų��
		}
		
		System.out.println("������ ���:" + (num1/num2));
	}

	public static int divide(int num1, int num2) {
//		divide : ���� ����, �� �� �Լ� �ۿ����� ��� �Ұ���
		int result = 0;
		if(num2==0) {
			System.out.println("(�˸�)0������ ���� �� �����ϴ�");
			
		}else {
			result = num1/num2;
		}
		return result;
		
	}
	
}

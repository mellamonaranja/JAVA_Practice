// �Է����� o ������� x

public class FunctionEx01 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		tellTime(10);
//		10�� hour�� �����. public static void tellTime(int hour){ ������ ���� return�� ������ ȣ���� ������ ��. 
//		return ���Ŀ� ���α׷��� ��� �̾���
		
		tellTime(18);
		

		System.out.println("���α׷� ����");
	}
	public static void tellTime(int hour){
//()���� �Է¹���. �׷����� ������ ������ �־�� ��. int�� �����. {}�ȿ��� hour��� �̸����� ����ϰڴ�
//		static������ method
//		�� �Լ� �ڵ� �ȿ����� �����͸� hour��� �̸����� ���

		System.out.println("��ſ� �Ϸ��Դϴ�.");
		System.out.println("���� �ð���" + hour + "�� �Դϴ�.");
		
		return;
//		���α׷� ȣ���� ������ �� ���� ���α׷��� ��� �̾����� ��
}
}
// �Է�����  ������� 
public class FunctionEx02 {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		tellTime(10, 48);
		byEveryone();
		tellTime(18, 30);
		
		int min = 40;
		tellTime(20, min);
		
		byEveryone();
		
		System.out.println("���α׷� ����");
	}
	public static void tellTime(int hour, int minute) {
//		hour, minute��� �����͸� �޾Ƽ� int������ ����ϰڴ�
//		hour, minute��� �� ���� �Է� �����Ͱ� �ְ�, void �� ������°� ����
		System.out.println("��ſ� �Ϸ��Դϴ�.");
		System.out.println("���� �ð���" + hour + "�� �Դϴ�.");
		System.out.println("���� �ð���" + minute + "�� �Դϴ�.");
	return;
//	�Լ� ���� �� 
	}

	public static void byEveryone() {
		
		System.out.println("���� �˰ڽ��ϴ�.");
	}
	
}

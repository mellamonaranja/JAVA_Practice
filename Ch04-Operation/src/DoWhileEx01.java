
public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int num = 10;
		do {
		System.out.println("I love JAVA- " + num);
		num++;
//		int�� num�� �ְ� num�� 0���� �ʱ�ȭ
//		I love JAVA�� ����Ұǵ�, num�� ����� ����
//		num�� 1�� �����ҰŰ�, �ݺ��� ����
//		num�� 7�̸������� �Ұ���
			
		}while(num<7);
//		�� ������ ���� �ʴ� �ϴ���(num�� 7���� ũ�ٰ� �ϴ���) ��ü ������ �� �� ����ȴ�
//		10�� ������ 10�� ��µǰ�, '�ݺ��� ���� �� num : 11'�� ��� �� ���������� �ȴ�
		
		System.out.println("�ݺ��� ���� �� num : " + num);

	}

}

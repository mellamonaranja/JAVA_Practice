
public class ArrayEx01 {

	public static void main(String[] args) {
		char ch0;
		char ch1;
		char ch2;
		char ch3;
		
		ch0 = 'J';
		ch1 = 'A';
		ch2 = 'V';
		ch3 = 'A';
				
				
		char[] ch;
//character���� ch��� ��������, �ϳ��� �̸��� ����ϰ� �ִ� ��
		ch = new char[4];
//		ch�迭 ����, ũ�Ⱑ 4�� char�� ������ �������, ���⿡ ������ �� �ִ� �޸� �ּҴ� char�� ��������
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
//		�� ������ ���� �־������ν� �迭�� �ʱ�ȭ����
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		System.out.println(ch);
//		�������϶���(ch�϶���) �ȿ� �ִ� �����͸� �̿� ���� Ȯ�� ������
		
		for(int i=0;i<4;i++) {
//			�迭�� 0������ ���۵ǹǷ�, �迭��  ������ ũ�⺸�� -1���� �־��ְų�, <4�ϰų�
			System.out.print("�迭" + i + "��° index: ");
			System.out.println(ch[i]);
		}
		
		int arr[] = new int[7];
		
		char[] ch5 = new char[] {'h','e','l','l','o'};
//		[]�ȿ� ���� ũ�⸦ �� �־��൵ ��. �ֳĸ� {}�ȿ� 5���� ĳ���Ͱ� ���ֱ� ������ []�� 5���� ���� �˰� ����
//		new char[] �� ������ ���� ����
		char[] ch6 = {'��','��'};
//		{}�� ����� ���ÿ� new char[] �� ������
//		���� ������ �� �� 
//		ex)char[] ch6; <--�̷��� ���� ������ �Ұ���
//		ch6={'��','��'};<--�̷��� ���� ������ �Ұ���
		
		
	}

}

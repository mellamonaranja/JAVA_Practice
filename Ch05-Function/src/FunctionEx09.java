
public class FunctionEx09 {

	public static void main(String[] args) {
		showJava(3);
		
	}

	public static void showJava(int cnt) {
		
		System.out.println("JAVA" + cnt);
//		��������
		if(cnt==1) {
			return;
		}
//		��������=�������ǰ� ������� ���̿� ��ġ�ؾ���, �׷��������� ���ѷ����� ����
		
		showJava(--cnt);
//		�������
		
	}
	
}
// �Է�(cnt)�� ���� ó��(int) �� ��ȯ��(void)

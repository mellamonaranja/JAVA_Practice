
public class BreakEx03 {

	public static void main(String[] args) {
//	3�� ����̰� 7�� ����� ������ ã�� ���α׷� (1~100)
//		ã���� �� �̻� �������� �ʰ� �ݺ����� ��������
//		�ݺ����� �������� �� ã�� ������ ����ϰ�, ã�� ���� ���� ã�� ���ߴٰ� ���
		int num = 1;
		boolean result = false;
		
		while(num<=10) {
			System.out.println(num);
			if(num%3==0 && num%7==0) {
				result = true;
				break;
			}
		}
	
}
}


public class FunctionEx06 {

	public static void main(String[] args) {
//		args�� {�ȿ����� ��밡���� ���� ����
		callNum();
		
		int result = square(7);
//		square�� int num���� �Ʒ����� ��������� ������, square()�� ���� �־���� ��
		System.out.println(result);

		for(int num=1;num<10;num++) {
			System.out.println(num);
		}
//		num�� for�ȿ����� ��� ������ ���� ����
		
	}
	public static void callNum() {
		int num=30;
		System.out.println(num);
//		num�� callNum������ ����� �� �ִ� ���� ����
	}
	
	public static int square(int num) {
		int result = num*num;
		return result;
	}
//	�Ű� ������ num�� ���������, num�� square�ȿ����� ��� ������ ���� ����

}

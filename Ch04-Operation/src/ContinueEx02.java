
public class ContinueEx02 {

	public static void main(String[] args) {
//		1~100���� �ݺ��ϸ鼭, 3�� ����̰ų� 7�� ����� ���� ī��Ʈ�ϴ� ���α׷�
//		3�� ����̰ų� 7�� ����� ���� ����ϰ� ī��Ʈ�� ������Ű��

		int i = 0;
		int count = 0;
		while((i++)<=100) {
			if(i%3!=0 || i%7!=0) {
				continue;
			}
			System.out.println(i);
			count++;
		}
		System.out.println("count: " + count);
		
}
}

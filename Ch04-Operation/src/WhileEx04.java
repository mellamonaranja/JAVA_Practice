
public class WhileEx04 {

	public static void main(String[] args) {
//		������ ���ϴ� ���α׷�
//		while����� ������� �Է��� ���� �������� 0�� �Է��ϱ� ������ ��� �����ּ���.(�Է��� ���� ��� �����ϰ� �־�� ��)
//		0�Է� �� ���� �Ŀ��� ������ �� �� �� ������ּ���.
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		int i = 1;
//		while(�ݺ�)�� ����� ���� �����ϱ�. i�� �ݺ����� ����� ����
		int sum = 0;
		System.out.println("���� ���ڸ� �Է����ּ���.>");
		
		while(i>0)  {
//		while�ݺ��� �ȿ��� ���ڸ� �Է¹��� ����. i>0 �ƴϸ� i!=0
			i = input.nextInt();
			sum= sum + i;
//			sum�� i�� ���� ���� sum�� �������
			
			System.out.println("�����հ� sum : " + sum);		
//			while�ݺ��� �ȿ��� ��� ������ֱ�
				}
		System.out.println("�ݺ��� �����մϴ�.");
		System.out.println("���� �հ�" + sum);
		
		input.close();
//		input�� ������� ������ ���⼭ �ݾ���


}
}
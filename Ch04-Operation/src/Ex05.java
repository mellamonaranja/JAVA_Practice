
public class Ex05 {

	public static void main(String[] args) {
//		Ư�� ���ڹ������� ������ ����� �հ� ���ϴ� ���α׷�
//		���ϴ� ���� 3�� �Է¹ޱ�
//		���ۼ���, ������, �հ踦 ���� ����(���)
		
//		���� ��°��
//		������ ���� ���� �Է�, ������ �� ���� �Է�, �հ踦 ���� ���� �Է�
//		ex)1, 50, 7-->1~50������ 7�� ����� �հ�� 196�� ����
		
		int numStart;
		int numEnd;
		int numMultiple;
		
		int i;
		int sum = 0;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("���� ���� �Է�>");
		numStart = scanner.nextInt();
		System.out.println("�� ���� �Է�>");
		numEnd = scanner.nextInt();
		System.out.println("�հ� ��� �Է�>");
		numMultiple = scanner.nextInt();
		
		i = numStart;
		while(i<=numEnd) {
			if(i%numMultiple == 0) {
			System.out.printf("%d\n", i);
			sum = sum + i;
		}
		
		i++;
		}
System.out.printf("%d ~ %d �������� %d ����� �հ� : %d", numStart, numEnd, numMultiple, sum);
		
	}

}


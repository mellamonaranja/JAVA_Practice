
public class WhileEx03 {

	public static void main(String[] args) {
		
//		1���� 100������ �������� ���ϴ� ���α׷�
//		�հ��:
//		1-100���� ��� �Լ� ���� �����, 100���� �����ؼ� ���ض�
//		expectation=5050
		int su = 0;
		int sum = 0;
		
		while(su<=100) {
			System.out.println("su:" + su);
			sum += su;
			su++;
		}
		System.out.println("sum : " + sum);
	}

}


public class DoWhileEx02 {

	public static void main(String[] args) {
		
		int su = 0;
		int num1 = 1;
		
		String msg = "Java World!";
//		msg��� ���ڿ� ���� ����
		
		System.out.println("do~while ���� ���");
		
		do {
			System.out.println(num1 + ":" + msg);
//			�� ���� num1���� 1������Ű���� ��
			num1++;
						
		}while(su++<5);
//		su�� 5�� �ǰų� �� �̻��� �� �� �� �ݺ����� ���������� �� ����
		
		System.out.println("do~while���� �� num1:" + num1);
		System.out.println("do~while���� �� su:" + su);

		
		su = 0;
		int num2 = 1;
		
		System.out.println("While������");
		while(su++<5) {
//			������(5�� ��) �� 1����
//			su     1 2 3 4 5 6
//			num2   1 2 3 4 5 ����X
//			num2++ 2 3 4 5 6
			
			System.out.println(num2 + " : " + msg);
			num2++;
			System.out.println("do~while���� �� num2:" + num2);
			System.out.println("do~while���� �� su:" + su);

			
			
		}
		
	}

}

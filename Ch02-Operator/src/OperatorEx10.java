
public class OperatorEx10 {
	
	public static void main(String [] args) {
		
		int n1 = 7;
		int result1 = 0;
		result1 = ++n1;
		
		System.out.println("result1 : " + result1);
		System.out.println("n1 : " + n1);
		
		int n2 = 7;
		int result2 = 0;
		result2 = --n2;
		System.out.println("result2 : " + result2);
		System.out.println("n2 : " + n2);
		
		int n3 = 7;
		int result3 = 0;
		result3 = n3++;
		System.out.println("result3 : " + result3);
//		���꿡 ���� ����
		System.out.println("n3 : " + n3);
//		+1
		
		int n4 = 7;
		int result4 = 0;
//		n���� ��Ȯ�� ����ϱ� ���� result���� 0����
		result4 = n4--; //<--���� ���๮
		System.out.println("result4 : " + result4);
		System.out.println("n4 : " + n4); //<--���⼭ ����(���� ����)
		
//		���������� ������ ��, ����/���Ұ��� �ش� ���� ���๮������ ������
//		���� ���κ��� ����
		
	}

}

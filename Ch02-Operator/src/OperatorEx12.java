
public class OperatorEx12 {
	
	public static void main(String[] args) {
		
		System.out.println("����");
		
		int a = 10;
		int b = 10;

//		boolean c = true && false;
//		true�� ����� ���迬��� && false�� ����� ���迬���
		boolean c = (a++ > ++b) && (++a > b++);
//		10 > 11 and 12 > 11 -->false
//		c=false
		
//		������ ���� �� ���� �ĺ��� �����
		
		System.out.println("c: " + c);
		System.out.println("b: " + b);
		System.out.println("a: " + a);
//		(a++ > ++b)�� false�� ������ 
//		&& (++a > b++)�� true�̰� false�̰� ��� �� ��
//		��a,b�� (a++ > ++b)���⼭ ���� 11�� ����
		
		int d = 10;
		int e = 10;
		
		boolean f = (++d > e++) || (d++ >= ++e);
//		(11 > 10(11)) or (11(12) > 12) -->true
//		(11 > 10(11))���� d=11, e=11�� ���� �׿��� �����
//		
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
//		true�̱⶧����, ������ ��� �� ����
//		��d=11, e=11�� ����
		
	}

}

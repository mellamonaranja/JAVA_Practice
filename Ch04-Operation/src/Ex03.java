
public class Ex03 {

	public static void main(String[] args) {
//	switch,case�� ���ؼ� ��Ģ���� ���α׷� �����
//	ù��° ���� �Է�, �ι�° ���� �Է�,������ ������ �Է�(+-*/%), ����� ���
		
		int i=0;
		int j=0;
		int result = 0;
		String operator;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("ù��° ���� �Է�>");
	
		i=input.nextInt();
		
		System.out.println("�ι�° ���� �Է�>");
		j=input.nextInt();
		
		
		System.out.println("������ �Է�>");
		operator = input.next();
		
		switch(operator) {
		case "+" : 
			result= (i + j);
			break;
		case "-" : 
			result= (i - j);
			break;
		case "*" : 
			result= i * j;
			break;
		case "/" : 
			result= (i / j);
			break;
		case " % " : 
			result= (i % j);
			break;
			default : 
				System.out.println("�߸��� ������ �Է�");
				
			}
		System.out.println(i+operator+j + "=" + result);
	

	}

}

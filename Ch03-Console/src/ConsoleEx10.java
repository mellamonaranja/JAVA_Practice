
public class ConsoleEx10 {

	public static void main(String[] args) {
		
//		�Է¹ޱ� : �Է¹��� �⵵�� �������� ���
//		4�� ������ ��������, 100���� ������ �������� ������ ����
//		400���� ������ �������� ����
		
		int year;
//		���� �����ϱ����� ���� ����
				
		System.out.println("�⵵�� �Է��ϼ���>>");
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		year = scanner.nextInt();
//		��ĳ�ʷ� ������ ���� year�� ����
		System.out.println("�⵵ ��� ��...");
		
//		String str (((year%4)==0) && (year%100)!=0) || ((year%400)==0))? "�����Դϴ�." : "������ �ƴմϴ�." ;
		
//		System.out.printf("%d���� %s, year, str);"
				
		boolean check = (((year%4)==0) && (year%100)!=0) || ((year%400)==0)? true : false ;
		
		if(check) {
			System.out.println("%d���� �����Դϴ�., year");
		} else {
			System.out.println("%d���� ������ �ƴմϴ�., year");
		}
		
	}

}

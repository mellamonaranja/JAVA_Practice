
public class SwitchEx03 {

	public static void main(String[] args) {
		String s = "Java";
//		string s��� ������ Java(Ȥ�� �Ʒ��� �ش��ϴ� ��� ����)��� ���� �־���-->���Ŀ� "�ڹ� ����Ͽ����ϴ�."�� ��� ����
		
		switch(s) {
		case "code":
//			���ڿ��� �ش��ϴ� code���� Ȯ��
			System.out.println("�ڵ� ����Ͽ����ϴ�.");
			break;
		case "Java":
			System.out.println("�ڹ� ����Ͽ����ϴ�.");
			break;	
		case "Python":
			System.out.println("���̽� ����Ͽ����ϴ�.");
			break;	
		default : 
			System.out.println("�ش��ϴ� ���ڿ��� �ƴմϴ�.");
			break;
		}

	}

}

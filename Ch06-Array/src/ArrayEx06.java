// ���� ó�� ���α׷�
// ����, ����, ����, ���� ������ �Է¹޾� �迭�� ������ �� ������ ����� ���
public class ArrayEx06 {

	public static void main(String[] args) {
		
		int k=0;
		int e=0;
		int m=0;
		int s=0;
		int korean ;
		int english;
		int maths;
		int science;
		
		korean = 'k';
		english = 'e';
		maths = 'm';
		science = 's';
	
		int total=0;
		float average=0.0f;
		char[] a = {'k','e','m','s'};
		
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("���� �Է�>");
//		i=input.nextInt();
		
//		korean=input.nextInt();
//		english=input.nextInt();
//		maths=input.nextInt();
//		science=input.nextInt();

		
		for(int j=0;j<a.length;j++) {
			if('k'>=100 && 'k'>=0) {
				k=input.nextInt();
				System.out.println("���� ������>" + k);	
				continue;
			}else if('e'!='k' && 'e'>=100 && 'e'>=0){
				e=input.nextInt();
				System.out.println("���� ������>" + e);
			}
		}
		
			total = korean+english+maths+science;
			
			average=(float)total/a.length;
			System.out.println("���� : " + total);
			System.out.println("��� : " + average);
			
			
						
		

	}

}


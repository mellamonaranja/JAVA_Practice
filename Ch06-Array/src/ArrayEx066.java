// ���� ó�� ���α׷�
// ����, ����, ����, ���� ������ �Է¹޾� �迭�� ������ �� ������ ����� ���
public class ArrayEx066 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"����", "����", "����", "����"};
		int[]score=new int[subname.length+1];
//		int�� �ش� �ڷ����� �ش��ϴ� �迭�� ũ�� 5���� ���� ����
		float average = 0.0f;
		
		for(int i=0;i<subname.length;i++) {
			
			do {
			System.out.println(subname[i] + "������ �Է��ϼ���>");
			score[i]=input.nextInt();
		}while(score[i]<0 || score[i]>100);
//			�Է¹��� ���� ��ȿ�� üũ�� �ϴ� ��(secure coding;���� ����)
			score[score.length-1] +=score[i];

	}
		average = (float)(score[score.length-1]/subname.length);
		System.out.println("���� :" + score[score.length-1]);
		System.out.printf("��� : %.2f" , average);
	}
}


public class IfEx03 {

	public static void main(String[] args) {
	
//		������ ��� �Ǵ��ϴ� ���α׷�
//		�Է¹��� ������ ����� �Ǵ��ϴ� ���α׷� �����
//		90-100 : a
//		80-89 : b
//		70-79 : c
//		60-69 : d
//		0-59 : f
		
		int score;
//		�Է¹��� ���� ����
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
//		input�� score�� ���� �ĺ��ڷ� 
		System.out.println("score�� �Է����ּ���. >");
		
		score = input.nextInt();
//		input�� �Է¹��� ���� nextInt�� ���ؼ� score�� ������
		char grade;
//		��� �����ϱ� ���� ���� �������
				
		if (score >=90 && score <=100) {
//			System.out.println("����� a�Դϴ�.");
			grade = 'a';

		}else if(score>=80 && score<=89) {
//			System.out.println("����� b�Դϴ�.");
			grade = 'b';
			
	    }else if(score>=70 && score<=79) {
//	    	System.out.println("����� c�Դϴ�.");
	    	grade = 'c';
		
	    }else if(score>=60 && score<=69) {
//	    	System.out.println("����� d�Դϴ�.");
	    	grade = 'd';
		
	    }else if(score>=0 && score<=59) {
//	    	System.out.println("����� f�Դϴ�.");
	    	grade = 'f';
	    			
	    }else {
	    	grade = '?';
	    	System.out.println("score�� �ٽ� �Է����ּ���");	
	    
	    	}
		
		System.out.println("score :" + score);
		System.out.println("grade :" + grade);
//	    	������ ������ score�� grade�� ���� ���	
			
	    }
	}




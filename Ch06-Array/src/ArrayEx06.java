// 성적 처리 프로그램
// 국어, 영어, 수학, 과학 점수를 입력받아 배열에 저장한 후 총점과 평균을 출력
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
		System.out.println("점수 입력>");
//		i=input.nextInt();
		
//		korean=input.nextInt();
//		english=input.nextInt();
//		maths=input.nextInt();
//		science=input.nextInt();

		
		for(int j=0;j<a.length;j++) {
			if('k'>=100 && 'k'>=0) {
				k=input.nextInt();
				System.out.println("수학 점수는>" + k);	
				continue;
			}else if('e'!='k' && 'e'>=100 && 'e'>=0){
				e=input.nextInt();
				System.out.println("영어 점수는>" + e);
			}
		}
		
			total = korean+english+maths+science;
			
			average=(float)total/a.length;
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + average);
			
			
						
		

	}

}


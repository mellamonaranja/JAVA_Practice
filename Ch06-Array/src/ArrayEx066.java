// 성적 처리 프로그램
// 국어, 영어, 수학, 과학 점수를 입력받아 배열에 저장한 후 총점과 평균을 출력
public class ArrayEx066 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"국어", "영어", "수학", "과학"};
		int[]score=new int[subname.length+1];
//		int에 해당 자료형에 해당하는 배열의 크기 5개의 방을 만듦
		float average = 0.0f;
		
		for(int i=0;i<subname.length;i++) {
			
			do {
			System.out.println(subname[i] + "점수를 입력하세요>");
			score[i]=input.nextInt();
		}while(score[i]<0 || score[i]>100);
//			입력받은 값의 유효성 체크를 하는 중(secure coding;개발 보안)
			score[score.length-1] +=score[i];

	}
		average = (float)(score[score.length-1]/subname.length);
		System.out.println("총점 :" + score[score.length-1]);
		System.out.printf("평균 : %.2f" , average);
	}
}

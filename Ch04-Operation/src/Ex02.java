
public class Ex02 {

	public static void main(String[] args) {
//		switch, case를 통해 성적 등급 처리 프로그램
//		100 a
//		99-90 a
//		89-80 b
//		79-70 c
//		69-60 d
//		59-0 f
//		정수형 성적 입력> 성적 출력 > 등급 출력
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("정수형 성적 입력해주세요>");
		int score;
		score=input.nextInt();
		char grade;
		
		switch(score/10) {
		case 10: 
		case 9:
			grade='a';
		break;
		case 8:
			grade='b';
		break;
		case 7:
			grade='c';
		break;
		case 6:
			grade='d';
		break;
		case 5:
			grade='f';
		
		default:
			grade = 'f';
			break;
			}
		System.out.println("score : " + score);
		System.out.println("grade : " + grade);	
		
		

	}

}

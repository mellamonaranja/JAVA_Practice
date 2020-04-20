
public class IfEx03 {

	public static void main(String[] args) {
	
//		점수의 등급 판단하는 프로그램
//		입력받은 점수에 등급을 판단하는 프로그램 만들기
//		90-100 : a
//		80-89 : b
//		70-79 : c
//		60-69 : d
//		0-59 : f
		
		int score;
//		입력받을 변수 저장
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
//		input은 score와 같은 식별자로 
		System.out.println("score를 입력해주세요. >");
		
		score = input.nextInt();
//		input에 입력받은 값을 nextInt를 통해서 score로 보여짐
		char grade;
//		등급 저장하기 위한 변수 만들어줌
				
		if (score >=90 && score <=100) {
//			System.out.println("등급은 a입니다.");
			grade = 'a';

		}else if(score>=80 && score<=89) {
//			System.out.println("등급은 b입니다.");
			grade = 'b';
			
	    }else if(score>=70 && score<=79) {
//	    	System.out.println("등급은 c입니다.");
	    	grade = 'c';
		
	    }else if(score>=60 && score<=69) {
//	    	System.out.println("등급은 d입니다.");
	    	grade = 'd';
		
	    }else if(score>=0 && score<=59) {
//	    	System.out.println("등급은 f입니다.");
	    	grade = 'f';
	    			
	    }else {
	    	grade = '?';
	    	System.out.println("score를 다시 입력해주세요");	
	    
	    	}
		
		System.out.println("score :" + score);
		System.out.println("grade :" + grade);
//	    	위에서 선언한 score와 grade를 각각 출력	
			
	    }
	}




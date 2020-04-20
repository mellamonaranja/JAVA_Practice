
public class WhileEx05 {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		while(i<10) {
			System.out.println("외부:" + i);
			
			j = 1;
//			바깥에서 j=1로 선언해줬기 때문에, 이 안에서도 j=1로 선언해야함
			while(j<10) {
				System.out.println("외부:" + i + ", 내부:" + j);
				j++;
			}
			i++;
		}
		
		

	}

}



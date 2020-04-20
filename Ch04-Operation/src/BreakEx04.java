
public class BreakEx04 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {

			if(i==7) {
				continue;
			}
			System.out.println(i);
//			i=0; i<=10; i++인 조건에서 i가 계속 수행되고 7만 나오지 않음
			}
		for(int i=0;i<=10;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
	}
}
			
			
			
	
				
				
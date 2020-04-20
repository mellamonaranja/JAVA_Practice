
public class BreakEx05 {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				
				if(j==3) {
					break;
//					j가 3이 되는 순간 이 문만 빠져나옴, 즉 3은 수행 안 함
				}
				System.out.println(i + "," + j);

			}
				
						}

		System.out.println("=========");
		exit_for:
//			반복구문 바로 위에 exit_for:라는 레이블을 지정함
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					break exit_for;
//					j가 3이 되는 순간  break exit for 때문에 내/외부를 한꺼번에 빠져나옴
				}
				System.out.println(i + "," + j);
			}
		}
	}

}

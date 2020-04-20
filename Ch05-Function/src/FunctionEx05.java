
public class FunctionEx05 {

	public static void main(String[] args) {
		
		boolean scope = true;
//		boolean안에 true라는 변수를 갖고 있는 scope를 만듬
//		정의된 main블록 안에서 모두 사용 가능
		
		if(scope) {
			int num=10;
			num++;
			System.out.println(num);
//			이 num은 if문 안에서만 사용 가능
		}else {
			int num=20;
			System.out.println(num);
//			이 num은 else코드 블록 안에서만 사용 가능
		}
		callNum();

	}
	public static void callNum(){
		int num=30;
		System.out.println(num);
	}

}

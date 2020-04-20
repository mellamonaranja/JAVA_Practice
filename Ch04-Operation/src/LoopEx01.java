// 17 배수이고 13의 배수인 정수 찾는 프로그램

public class LoopEx01 {

	public static void main(String[] args) {
		
	int num=1;
		for(num = 1; true; num++) {
			if(num%17==0 && num%13==0) {
	break;
			}
			}
		System.out.println("찾은 정수:" + num);

}
}

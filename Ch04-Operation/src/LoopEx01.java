// 17 ����̰� 13�� ����� ���� ã�� ���α׷�

public class LoopEx01 {

	public static void main(String[] args) {
		
	int num=1;
		for(num = 1; true; num++) {
			if(num%17==0 && num%13==0) {
	break;
			}
			}
		System.out.println("ã�� ����:" + num);

}
}

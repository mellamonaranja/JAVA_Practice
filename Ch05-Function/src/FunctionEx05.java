
public class FunctionEx05 {

	public static void main(String[] args) {
		
		boolean scope = true;
//		boolean�ȿ� true��� ������ ���� �ִ� scope�� ����
//		���ǵ� main��� �ȿ��� ��� ��� ����
		
		if(scope) {
			int num=10;
			num++;
			System.out.println(num);
//			�� num�� if�� �ȿ����� ��� ����
		}else {
			int num=20;
			System.out.println(num);
//			�� num�� else�ڵ� ��� �ȿ����� ��� ����
		}
		callNum();

	}
	public static void callNum(){
		int num=30;
		System.out.println(num);
	}

}

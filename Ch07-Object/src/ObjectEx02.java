
public class ObjectEx02 {

	public static void main(String[] args) {
		Number myNumber = new Number();
//		���� numberŬ������ ��ü�� myNumber�� ���� �� ����
		
		System.out.println("�޼ҵ� ȣ�� �� ��:" + myNumber.getNum());
		
		myNumber.addNum(10);
		System.out.println("�޼ҵ� ȣ�� �� ��:" + myNumber.getNum());

		System.out.println(myNumber);
		
		instMethod(myNumber);
		System.out.println("�������� ���ڷ� �޼ҵ� ȣ���� ���� ��:" + myNumber.getNum());
	}

	public static void instMethod(Number number) {
		number.addNum(7);
//		numberŬ���� ��ü�� �������� ���� �� �ִ� number�� ����� ��
	}
//	��ü ���� ���� ȣ���ϱ� ���� static�� ����
	
}

class Number{
	int num=0;
//	num�� �������=instance����
//	member method�̱⵵ �ϰ� instance method�̱⵵ ��. ��ü�� �����ؾ߸� �ϴ� method�̱� ����
	
	
	public void addNum(int n) {
		this.num += n;
//		�� num�� �������=instance����
	}
	
	public int getNum() {
		return num;
	}
//	public Number(){
//  }
//	�⺻ ������, ������ �����ڸ� ������ �ʾ��� ���� �ڹٰ� �⺻ �����ڸ� �������
	
}

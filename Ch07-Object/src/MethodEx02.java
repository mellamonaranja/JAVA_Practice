
public class MethodEx02 {

	int money;
//	��� ����
	
	public void setMoney(int money) {
		System.out.println(money);
		this.money=money;
//		��� ������� ���� �������� ����(money), ȣ�� �� ����� ������ ����ް� �� ���� ��� �������� ���� ������ ������ �ް� ��
//		this:�� ��ü�� money
	}
	
	public int getMoney() {
		return money;
	}
//	��� �޼ҵ�
	public static void main(String[] args) {
		MethodEx02 me = new MethodEx02();
		me.setMoney(5580);
		System.out.println(me.getMoney());

	}

}

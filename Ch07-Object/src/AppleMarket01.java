/*// ��� ���� �м�(��ü, ����, �޼ҵ� �м�)
// ��ü : ����Ǹ���, ���������
// ���� : ��� ����
// ������, �Ӽ� : ��� ����, �Ǹ� ����
// ���, ����(�޼ҵ�) : ����� �Ǵ�/���

public class AppleMarket01 {
	
//	~AppleMarket01 : destructor

	public static void main(String[] args) {
		
		AppleSeller Seller = new AppleSeller();
		AppleBuyer Buyer = new AppleBuyer();
		
		Seller.showSaleResult();
		Buyer.showBuyResult();
		
		Buyer.buyApple(Seller, 2000);
		System.out.println("��� �Ǹ����� ���� ����");
		Seller.showSaleResult();
		
		System.out.println("��� �������� ���� ����");
		Buyer.showBuyResult();

	}

}


class AppleSeller{
	int numOfApple = 30;
	final int APPLE_PRICE = 1000;
	int myMoney=0;
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney = myMoney+money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("���� ���" + numOfApple);
		System.out.println("�Ǹ� ����" + myMoney);
	}
}

class AppleBuyer{
	int numOfApple=0;
	int myMoney=10000;
	
public void buyApple(AppleSeller seller, int money) {
	numOfApple += seller.saleApple(money);
	myMoney -=money;
}

public void showBuyResult() {
	System.out.println("��� ����" +numOfApple);
	System.out.println("���� �ݾ�" + myMoney);
}

}
*/
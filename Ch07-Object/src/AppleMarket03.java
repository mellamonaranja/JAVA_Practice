class AppleSeller{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
//	1. ��� ����
	
	public AppleSeller(int appleNumber, int money, int price) {
		numOfApple = appleNumber;
		myMoney=money;
		APPLE_PRICE=price;
//		2. �����ڿ��� ��� �ʱ�ȭ����
	}
		
		public int saleApple(int money) {
			int num= money/APPLE_PRICE;
			numOfApple -= num;
			myMoney +=money;
			
			return num;
		}
		
		public void showSaleResult() {
			System.out.println("��� ����"+numOfApple);
			System.out.println("���� �ݾ�"+myMoney);
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

public class AppleMarket03 {

	public static void main(String[] args) {
		
		AppleSeller seller1=new AppleSeller(20,0,2500);
		AppleSeller seller2=new AppleSeller(50,0,1000);
		
		System.out.println("��� 1�Ǹ����� ���� ����");
		seller1.showSaleResult();
		
		System.out.println("��� 2�Ǹ����� ���� ����");
		seller2.showSaleResult();
		
		AppleBuyer buyer=new AppleBuyer();
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("��� 1�Ǹ����� �Ǹ� �� ����");
		seller1.showSaleResult();
		
		System.out.println("��� 2�Ǹ����� �Ǹ� �� ����");
		seller2.showSaleResult();
		
		System.out.println("��� �������� ���� �� ����");
		buyer.showBuyResult();
	}

}

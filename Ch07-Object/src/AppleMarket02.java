/*
class AppleSeller{
	
	int numOfApple;
	int applePrice;
	int myMoney;
//	��� ����
	
	public void initSeller(int appleNumber, int price, int money) {
//		�� ���� ���ڰ� �ʱ�ȭ
		
		numOfApple = appleNumber;
		applePrice = price;
		myMoney = money;
		
//		��������� �ʱ�ȭ�ϱ����� �Լ� �������
		
		public int saleApple(int money) {
			int num = money/applePrice;
			
			numOfApple -= num;
			money += money;
			return num;
		}
		
		public void showSaleResult() {
			System.out.println("���� ���" + numOfApple);
			System.out.println("���� �ݾ�" + money);
		}
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
public class AppleMarket02 {

	public static void main(String[] args) {
		
		AppleSeller seller1=new AppleSeller seller1;
		AppleSeller seller2=new AppleSeller seller2;
		
		System.out.println("����Ǹ���1�� ���� ����");
		seller1.showSaleResult();
		
		System.out.println("����Ǹ���2�� ���� ����");
		seller2.showSaleResult();
				
		seller1.initSeller(20, 2500,0);
		seller2.initSeller(50, 1000, 0);
//		�޼ҵ� ȣ��
//		�����ڸ� ���ؼ� �ʱ�ȭ
		
		System.out.println("����Ǹ���1�� �ʱ�ȭ �� ����");
		seller1.showSaleResult();
				
		System.out.println("����Ǹ���2�� �ʱ�ȭ �� ����");
		seller2.showSaleResult();
		
		AppleBuyer buyer = new AppleBuyer();
		System.out.println("��� �������� ����");
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("����Ǹ���1�� �Ǹ� �� ����");
		seller1.showSaleResult();
				
		System.out.println("����Ǹ���2�� �Ǹ� �� ����");
		seller2.showSaleResult();
		
		System.out.println("��� �������� ���� �� ����");
		buyer.showBuyResult();

	}

}
*/
class AppleSeller{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
//	1. 상수 생성
	
	public AppleSeller(int appleNumber, int money, int price) {
		numOfApple = appleNumber;
		myMoney=money;
		APPLE_PRICE=price;
//		2. 생성자에서 상수 초기화해줌
	}
		
		public int saleApple(int money) {
			int num= money/APPLE_PRICE;
			numOfApple -= num;
			myMoney +=money;
			
			return num;
		}
		
		public void showSaleResult() {
			System.out.println("사과 개수"+numOfApple);
			System.out.println("보유 금액"+myMoney);
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
	System.out.println("사과 개수" +numOfApple);
	System.out.println("보유 금액" + myMoney);
}

}

public class AppleMarket03 {

	public static void main(String[] args) {
		
		AppleSeller seller1=new AppleSeller(20,0,2500);
		AppleSeller seller2=new AppleSeller(50,0,1000);
		
		System.out.println("사과 1판매자의 현재 상태");
		seller1.showSaleResult();
		
		System.out.println("사과 2판매자의 현재 상태");
		seller2.showSaleResult();
		
		AppleBuyer buyer=new AppleBuyer();
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("사과 1판매자의 판매 후 상태");
		seller1.showSaleResult();
		
		System.out.println("사과 2판매자의 판매 후 상태");
		seller2.showSaleResult();
		
		System.out.println("사과 구매자의 구매 후 상태");
		buyer.showBuyResult();
	}

}

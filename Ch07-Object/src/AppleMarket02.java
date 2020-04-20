/*
class AppleSeller{
	
	int numOfApple;
	int applePrice;
	int myMoney;
//	멤버 변수
	
	public void initSeller(int appleNumber, int price, int money) {
//		세 개의 인자값 초기화
		
		numOfApple = appleNumber;
		applePrice = price;
		myMoney = money;
		
//		멤버변수를 초기화하기위한 함수 만들어줌
		
		public int saleApple(int money) {
			int num = money/applePrice;
			
			numOfApple -= num;
			money += money;
			return num;
		}
		
		public void showSaleResult() {
			System.out.println("보유 사과" + numOfApple);
			System.out.println("보유 금액" + money);
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
	System.out.println("사과 개수" +numOfApple);
	System.out.println("보유 금액" + myMoney);
}

}
public class AppleMarket02 {

	public static void main(String[] args) {
		
		AppleSeller seller1=new AppleSeller seller1;
		AppleSeller seller2=new AppleSeller seller2;
		
		System.out.println("사과판매자1의 현재 상태");
		seller1.showSaleResult();
		
		System.out.println("사과판매자2의 현재 상태");
		seller2.showSaleResult();
				
		seller1.initSeller(20, 2500,0);
		seller2.initSeller(50, 1000, 0);
//		메소드 호출
//		생성자를 통해서 초기화
		
		System.out.println("사과판매자1의 초기화 후 상태");
		seller1.showSaleResult();
				
		System.out.println("사과판매자2의 초기화 후 상태");
		seller2.showSaleResult();
		
		AppleBuyer buyer = new AppleBuyer();
		System.out.println("사과 구매자의 상태");
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("사과판매자1의 판매 후 상태");
		seller1.showSaleResult();
				
		System.out.println("사과판매자2의 판매 후 상태");
		seller2.showSaleResult();
		
		System.out.println("사과 구매자의 구매 후 상태");
		buyer.showBuyResult();

	}

}
*/
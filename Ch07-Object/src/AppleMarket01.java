/*// 사과 마켓 분석(객체, 변수, 메소드 분석)
// 객체 : 사과판매자, 사과구매자
// 변수 : 사과 개수
// 데이터, 속성 : 사과 가격, 판매 수익
// 기능, 행위(메소드) : 사과를 판다/산다

public class AppleMarket01 {
	
//	~AppleMarket01 : destructor

	public static void main(String[] args) {
		
		AppleSeller Seller = new AppleSeller();
		AppleBuyer Buyer = new AppleBuyer();
		
		Seller.showSaleResult();
		Buyer.showBuyResult();
		
		Buyer.buyApple(Seller, 2000);
		System.out.println("사과 판매자의 현재 상태");
		Seller.showSaleResult();
		
		System.out.println("사과 구매자의 현재 상태");
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
		System.out.println("보유 사과" + numOfApple);
		System.out.println("판매 수익" + myMoney);
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
*/
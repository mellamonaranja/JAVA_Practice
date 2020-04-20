
public class MethodEx02 {

	int money;
//	멤버 변수
	
	public void setMoney(int money) {
		System.out.println(money);
		this.money=money;
//		멤버 변수명과 지역 변수명이 같음(money), 호출 시 가까운 변수가 선언받게 됨 ∴이 블록 내에서는 지역 변수의 적용을 받게 됨
//		this:이 객체의 money
	}
	
	public int getMoney() {
		return money;
	}
//	멤버 메소드
	public static void main(String[] args) {
		MethodEx02 me = new MethodEx02();
		me.setMoney(5580);
		System.out.println(me.getMoney());

	}

}

package com.ext1;


class Money{
	
	public static int balance=0;
//	balance is variable in class, so it is member variable
//	and also it is instance variable
//	approachable only with class.balance
	
	public void addMoney(int num) {
		balance+=num;
	}
}
	
	class SaveMoney extends Money{
		
		public void savemoney(int money) {
//		SaveMoney is same as savemoney
//			only different thing is class/variable
			balance+=money;
		}
		
		public void showMoney() {
			System.out.println("accumulated money" + balance);
		}
	}
	


public class Extend06 {

	public static void main(String[] args) {
		Money money=new Money();
		SaveMoney saveMoney=new SaveMoney();
		
		saveMoney.showMoney();
		money.addMoney(1000);
		saveMoney.showMoney();
		saveMoney.savemoney(2000);
		
		Money.balance+=22;
		saveMoney.showMoney();
		
		saveMoney.balance+=500;
		saveMoney.showMoney();
		
		money.balance+=30;
		saveMoney.showMoney();
		
		saveMoney.balance+=44;
		saveMoney.showMoney();
	}

}

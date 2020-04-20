// private       default       protected     public
// within class  same package  inheritance   

package com.ext1;

class Bank{
	private int balance;
//	cannot be taken over to child cuz this is private
	public Bank(int init) {
		balance = init;		
	}
	
	protected void accumulate(int num) {
//		accumulate function 
		if(num<0) {
			return;
		
	}
		balance+=num;
	}
	
	protected int getBalance() {
		return balance;
	}
}

class SaveAccount extends Bank{
	public SaveAccount(int initDeposit) {
		super(initDeposit);
	}
	
	public void saveMoney(int money) {
		accumulate(money);
	}
	
	public void showMoney(int money) {
		System.out.println("accumulated money");
		System.out.println(getBalance());
//		System.out.println(balance);
//		cannot take over from parent because this is initialized private
	}
}

public class Extend05 {

	public static void main(String[] args) {
		SaveAccount saveaccount = new SaveAccount(10000);
		saveaccount.showMoney(20000);
		saveaccount.showMoney(30000);
		saveaccount.showMoney(40000);
		saveaccount.showMoney(50000);
		
	}

}

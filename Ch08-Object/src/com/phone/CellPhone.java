package com.phone;

public class CellPhone {
	
	protected String model;
	protected String number;
	protected int bellsound;
	//those members are fixed for inheriting
	//declare protected which is 

	public CellPhone(String model, String number, int bellsound) {
		this.model=model;
		this.number=number;
		this.bellsound=bellsound;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
	
	public int getBellsound() {
		return bellsound;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

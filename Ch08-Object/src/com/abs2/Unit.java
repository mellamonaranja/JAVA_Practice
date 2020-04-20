package com.abs2;

public abstract class Unit{
	
	protected String name;
	protected int energy;
	
	abstract public void decEnergy();
	abstract public void incEnergy();
//	forcing to use
	
	public int getEnergy() {
		return energy;
	}
	
}



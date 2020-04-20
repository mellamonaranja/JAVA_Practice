package com.abs2;


public class StarCraft {

	public static void main(String[] args) {
		
		Protoss protoss = new Protoss("protoss", 100, true);
		Terran terran = new Terran("terran", 100, false);
		Zerg zerg = new Zerg("zerg", 100,true);
		
		System.out.println("protoss energy in stock "+protoss.getEnergy());
		System.out.println("terran energy in stock "+terran.getEnergy());
		System.out.println("zerg energy in stock "+zerg.getEnergy());
		
		protoss.decEnergy();
		System.out.println("protoss energy in stock "+protoss.getEnergy());
		
		terran.decEnergy();
		System.out.println("terran energy in stock "+terran.getEnergy());
		
		zerg.decEnergy();
		System.out.println("zerg energy in stock "+zerg.getEnergy());
		
	}

}

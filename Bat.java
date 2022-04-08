package com.ml.zookeeper2project;

public class Bat extends Mammal{
	
	//Attributes============================================================
	
	//Constructors============================================================
	
	
	//Methods============================================================
	//fly() method, print the sound a bat taking off and decrease its energy by 50.
	public void fly(int numFly) {
		System.out.println("123 flying Bat took off...");
		super.setEnergyLevel(getEnergyLevel()-50 * numFly);
	}
	
	//eatHumans()=============================================
	//print the so- well, never mind, just increase its energy by 25.
	public void eatHuman(int numHumanAte) {
		System.out.println("so-well, never mind...");
		super.setEnergyLevel(getEnergyLevel()-50 *numHumanAte);
		
	}
	
	//attackTown()==============================================
	//print the sound of a town on fire and decrease its energy by 100.
	public void attackTown(int numTown) {
		System.out.println("fire...");
		super.setEnergyLevel(getEnergyLevel()-100 *numTown);
		
	}
	
	//Getters & Setters============================================================

}

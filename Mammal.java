package com.ml.zookeeper2project;

public class Mammal {
	
	//Attributes============================================================
	private int energyLevel = 300;

	
	//Constructors============================================================
	
	
	public Mammal() {
		super();
	}
	
	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}


	//Methods============================================================
	
	//Setters & Getters============================================================

	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}

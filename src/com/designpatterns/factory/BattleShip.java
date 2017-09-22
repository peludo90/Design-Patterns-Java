package com.designpatterns.factory;

public abstract class BattleShip {

	private String name;
	private double damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void displayShip() {
		System.out.println(name + " is on the screen");
	}

	public void shoots() {
		System.out.println(name + " shoots and make " + damage + " damage");

	}
}

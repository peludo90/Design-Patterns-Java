package com.designpatterns.adapter;

public class TankAttaker implements Attacker {

	@Override
	public String fireWeapon() {
		return "Fire weapon, piu piu!";
	}

	@Override
	public String move() {
		return "Move forward";
	}

	@Override
	public String assignDriver(String driver) {
		return driver + " is now the driver";
	}

}

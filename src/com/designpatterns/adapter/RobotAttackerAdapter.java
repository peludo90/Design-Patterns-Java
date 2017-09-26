package com.designpatterns.adapter;

public class RobotAttackerAdapter implements Attacker {

	RobotAttacker robotAttacker;

	public RobotAttackerAdapter(RobotAttacker robotAttacker) {
		this.robotAttacker = robotAttacker;
	}

	@Override
	public String fireWeapon() {
		return "Robot " + robotAttacker.hit() + " and " + robotAttacker.kick();
	}

	@Override
	public String move() {
		return robotAttacker.move();
	}

	@Override
	public String assignDriver(String driver) {
		return robotAttacker.smashHuman(driver);
	}

}

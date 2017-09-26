package com.designpatterns.adapter;

public class RobotAttacker {

	public String hit() {
		return "Hit the front";
	}

	public String kick() {
		return "Kick the front";
	}

	public String move() {
		return "Move forward fast";
	}

	public String smashHuman(String human) {
		return human + " has been smashed";
	}
}

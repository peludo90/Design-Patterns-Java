package com.designpatterns.strategy;

public class SuperSonicPlane extends Ship {

	public SuperSonicPlane() {
		setName("F15");
		setFunction("Combat");
		setFlying(new FastFlying());
	}
}

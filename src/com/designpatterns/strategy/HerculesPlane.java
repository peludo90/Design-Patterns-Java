package com.designpatterns.strategy;

public class HerculesPlane extends Ship {

	public HerculesPlane() {

		setName("Hercules planes");
		setFunction("Transport");
		setFlying(new SlowFlying());
	}
}

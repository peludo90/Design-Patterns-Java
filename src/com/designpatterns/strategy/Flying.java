package com.designpatterns.strategy;

public interface Flying {

	boolean canFly();

	String flyingSpeed();

}

class CantFly implements Flying {

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public String flyingSpeed() {
		return null;
	}

}

class SlowFlying implements Flying {

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public String flyingSpeed() {
		return "Slow flying";
	}

}

class MediumFlying implements Flying {

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public String flyingSpeed() {
		return "Medium flying";
	}

}

class FastFlying implements Flying {

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public String flyingSpeed() {
		return "Fast flying";
	}

}
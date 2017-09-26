package com.designpatterns.abstractfactory;

public interface WeaponAbs {

	int amount();

	double damage();

}

class HeavyWeaponery implements WeaponAbs {

	@Override
	public int amount() {
		return 20;
	}

	@Override
	public double damage() {
		return 200.0;
	}

}

class MediumWeaponery implements WeaponAbs {

	@Override
	public int amount() {
		return 10;
	}

	@Override
	public double damage() {
		return 100.0;
	}

}

class LightWeaponery implements WeaponAbs {

	@Override
	public int amount() {
		return 5;
	}

	@Override
	public double damage() {
		return 50.;
	}

}

class NoWeaponery implements WeaponAbs {

	@Override
	public int amount() {
		return 0;
	}

	@Override
	public double damage() {
		return 0.0;
	}

}

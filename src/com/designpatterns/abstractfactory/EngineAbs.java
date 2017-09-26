package com.designpatterns.abstractfactory;

public abstract class EngineAbs {

	private double fuel;

	abstract double getTrust();

	double getFuel() {
		return fuel;
	};

	void setFuel(double fuel) {
		this.fuel = fuel;
	};
}

class FastEngine extends EngineAbs {

	@Override
	public double getTrust() {

		return 1000;
	}

}

class RegularEngine extends EngineAbs {

	@Override
	public double getTrust() {

		return 200;
	}

}

class HeavyEngine extends EngineAbs {

	@Override
	public double getTrust() {

		return 700;
	}

}
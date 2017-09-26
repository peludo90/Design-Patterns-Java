package com.designpatterns.abstractfactory;

public interface FuselageAbs {

	double getSize();

	double getMass();
}

class CombatFuselage implements FuselageAbs {

	@Override
	public double getSize() {
		return 50.0;
	}

	@Override
	public double getMass() {
		return 10.0;
	}

}

class TransportFuselage implements FuselageAbs {

	@Override
	public double getSize() {
		return 100.0;
	}

	@Override
	public double getMass() {
		return 20.0;
	}

}

class TravelFuselage implements FuselageAbs {

	@Override
	public double getSize() {
		return 100.0;
	}

	@Override
	public double getMass() {
		return 30.0;
	}

}

class MultipurposeFuselage implements FuselageAbs {

	@Override
	public double getSize() {
		return 150;
	}

	@Override
	public double getMass() {
		return 50;
	}

}

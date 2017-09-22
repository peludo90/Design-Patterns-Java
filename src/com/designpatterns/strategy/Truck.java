package com.designpatterns.strategy;

public class Truck extends Ship {

	public Truck() {
		setName("Truck");
		setFunction("Transport");
		setFlying(new CantFly());
	}

}

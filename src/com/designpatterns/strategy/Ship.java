package com.designpatterns.strategy;

public abstract class Ship {
	

	private String name;
	private String function;
	private Flying flying;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Flying getFlying() {
		return flying;
	}

	public void setFlying(Flying flying) {
		this.flying = flying;
	}

}

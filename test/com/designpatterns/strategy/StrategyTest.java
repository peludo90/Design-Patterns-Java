package com.designpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void Trucktest() {

		Truck truck = new Truck();

		assertFalse(truck.getFlying().canFly());
		assertNull(truck.getFlying().flyingSpeed());

	}

	@Test
	public void HerculesPlaneest() {

		Ship hercules = new HerculesPlane();

		assertTrue(hercules instanceof Ship);
		assertTrue(hercules instanceof HerculesPlane);
		assertTrue(hercules.getFlying().canFly());
		assertNotNull(hercules.getFlying().flyingSpeed());

	}

	@Test
	public void SupersonicPlaneTest() {

		Ship superSonic = new SuperSonicPlane();

		assertTrue(superSonic.getFlying().canFly());
		assertNotNull(superSonic.getFlying().flyingSpeed());

	}

}

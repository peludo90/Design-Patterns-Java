package com.designpatterns.factory;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FactoryTest {

	private static BattleShipFactory factory;

	@BeforeClass
	public static void beforeClass() {
		factory = new BattleShipFactory();
	}

	@Test
	public void nullResult() {

		BattleShip noShip = factory.makeShip(8888);

		assertNull(noShip);
	}

	@Test
	public void validateLightShip() {
		BattleShip lightShip = factory.makeShip(BattleShipFactory.LIGHT_SHIP);

		assertTrue(lightShip instanceof LightShip);
	}

	@Test
	public void validateHeavyShip() {
		BattleShip heavyShip = factory.makeShip(BattleShipFactory.HEAVY_SHIP);

		assertTrue(heavyShip instanceof HeavyShip);
	}

	@Test
	public void validateHeaviestShip() {
		BattleShip heaviestShip = factory.makeShip(BattleShipFactory.HEAVIEST_SHIP);

		assertTrue(heaviestShip instanceof HeaviestShip);
	}

}

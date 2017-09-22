package com.designpatterns.factory;

public class BattleShipFactory {

	public final static int LIGHT_SHIP = 1;
	public final static int HEAVY_SHIP = 2;
	public final static int HEAVIEST_SHIP = 3;

	public BattleShip makeShip(int code) {

		BattleShip battleShip = null;

		switch (code) {
		case LIGHT_SHIP:
			battleShip = new LightShip();
			break;
		case HEAVY_SHIP:
			battleShip = new HeavyShip();
			break;
		case HEAVIEST_SHIP:
			battleShip = new HeaviestShip();
			break;
		default:
			break;
		}

		return battleShip;
	}
}

package com.designpatterns.singleton;

public class GameManager {

	private static GameManager singleton = null;

	private GameManager() {

	}

	public static GameManager getInstance() {

		if (singleton == null)
			singleton = new GameManager();

		return singleton;
	}

}

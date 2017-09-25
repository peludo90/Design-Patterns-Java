package com.designpatterns.singleton;

public class GaminTry implements Runnable {

	@Override
	public void run() {

		GameManager gameManager = GameManager.getInstance();

		System.out.println("ID hascode: " + System.identityHashCode(gameManager));

		System.out.println("Tiles " + gameManager.getTiles(7));
		System.out.println("Left " + gameManager.getLetterList());

	}
}
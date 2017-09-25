package com.designpatterns.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void HashcodeTest() {

		GameManager gameManager1 = GameManager.getInstance();
		GameManager gameManager2 = GameManager.getInstance();

		assertEquals(System.identityHashCode(gameManager1), System.identityHashCode(gameManager2));

	}

	@Test
	public void ThreadTest() {

		new Thread(new GaminTry()).start();
		new Thread(new GaminTry()).start();

	}

}

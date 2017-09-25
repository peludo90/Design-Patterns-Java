package com.designpatterns.singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class GameManager {

	private static GameManager singleton = null;

	private String[] scrableLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "c", "c", "c", "d",
			"d", "d", "d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "f", "g", "g", "g", "h", "h", "h",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "k", "l", "l", "l", "m", "m", "m", "n", "n", "n", "o", "o",
			"o", "o", "o", "o", "o", "p", "p", "p", "q", "q", "q", "r", "r", "r", "s", "s", "s", "t", "t", "t", "u",
			"u", "u", "u", "u", "u", "u", "v", "v", "w", "w", "x", "x", "y", "y", "y", "z", " ", " " };

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrableLetters));
	private static boolean firsThread = true;

	private GameManager() {

	}

	public static GameManager getInstance() {

		if (singleton == null) {

			if (firsThread) {
				firsThread = false;

				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			synchronized (GameManager.class) {
				singleton = new GameManager();
				java.util.Collections.shuffle(singleton.letterList);
			}

		}

		return singleton;
	}

	public LinkedList<String> getLetterList() {
		return singleton.letterList;
	}

	public LinkedList<String> getTiles(int numTiles) {

		LinkedList<String> result = new LinkedList<>();

		for (int i = 0; i < numTiles; i++) {
			result.add(singleton.letterList.remove(0));
		}

		return result;
	}
}

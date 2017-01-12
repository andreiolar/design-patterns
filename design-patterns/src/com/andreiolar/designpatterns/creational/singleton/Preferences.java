package com.andreiolar.designpatterns.creational.singleton;

/**
 * @author Andrei Olar
 **/
public class Preferences {

	/**
	 * Holder of the single instance for the singleton class
	 **/
	private static Preferences instance = null;

	/**
	 * No other classes can instantiate a singleton.
	 **/
	protected Preferences() {
	}

	/**
	 * Access method to get hold of the singleton instance.
	 * 
	 * @return Returns the singleton instance.
	 **/
	public synchronized static Preferences getInstance() {
		if (instance == null) {
			instance = new Preferences();
		}

		return instance;
	}

	public void helloSingleton() {
		System.out.println("Hello. I'm a Singleton!");
	}
}

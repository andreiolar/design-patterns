package com.andreiolar.designpatterns.creational.singleton;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		Preferences.getInstance().helloSingleton();
		ChildPreferences.getInstance().helloSingleton();
	}

}

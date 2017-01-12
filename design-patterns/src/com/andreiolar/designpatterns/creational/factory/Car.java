package com.andreiolar.designpatterns.creational.factory;

/**
 * @author Andrei Olar
 **/
public class Car extends Transport {

	@Override
	public void drive() {
		System.out.println("Car driving");
	}
}

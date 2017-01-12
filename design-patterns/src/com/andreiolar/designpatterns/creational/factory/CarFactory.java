package com.andreiolar.designpatterns.creational.factory;

/**
 * @author Andrei Olar
 **/
public class CarFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Car();
	}

}

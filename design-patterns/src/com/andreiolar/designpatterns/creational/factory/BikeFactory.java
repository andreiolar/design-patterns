package com.andreiolar.designpatterns.creational.factory;

/**
 * @author Andrei Olar
 **/
public class BikeFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Bike();
	}

}

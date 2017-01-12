package com.andreiolar.designpatterns.creational.factory;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		TransportFactory factory = new BikeFactory();
		Transport transport = factory.create();
		transport.drive();

		factory = new CarFactory();
		transport = factory.create();
		transport.drive();
	}
}

package com.andreiolar.designpatterns.behavioral.visitor;

/**
 * @author Andrei Olar
 **/
public abstract class CarPart {

	public void acceptCarPartVisitor(CarPartVisitor visitor) {
		visitor.visit(this);
	}
}

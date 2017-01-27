package com.andreiolar.designpatterns.behavioral.visitor;

/**
 * @author Andrei Olar
 **/
public class PrintCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("Print " + carPart);
	}
}

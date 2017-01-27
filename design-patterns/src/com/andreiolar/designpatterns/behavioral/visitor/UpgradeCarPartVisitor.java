package com.andreiolar.designpatterns.behavioral.visitor;

/**
 * @author Andrei Olar
 **/
public class UpgradeCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("Upgrade " + carPart);
	}
}

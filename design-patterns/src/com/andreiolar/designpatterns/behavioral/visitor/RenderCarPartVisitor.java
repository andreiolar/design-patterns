package com.andreiolar.designpatterns.behavioral.visitor;

/**
 * @author Andrei Olar
 **/
public class RenderCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("Render " + carPart);
	}
}

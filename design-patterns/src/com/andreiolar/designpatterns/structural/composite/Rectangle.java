package com.andreiolar.designpatterns.structural.composite;

/**
 * @author Andrei Olar
 **/
public class Rectangle implements Graphic {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

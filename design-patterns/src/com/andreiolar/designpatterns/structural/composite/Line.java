package com.andreiolar.designpatterns.structural.composite;

/**
 * @author Andrei Olar
 **/
public class Line implements Graphic {

	@Override
	public void draw() {
		System.out.println("Draw Line");
	}

}

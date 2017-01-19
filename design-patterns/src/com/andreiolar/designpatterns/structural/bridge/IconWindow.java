package com.andreiolar.designpatterns.structural.bridge;

/**
 * @author Andrei Olar
 **/
public class IconWindow extends Window {

	public void drawIcon() {
		draw(0, 0, 10, 10, "White");
		draw(0, 10, 10, 10, "Black");
	}
}

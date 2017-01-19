package com.andreiolar.designpatterns.structural.decorator;

/**
 * @author Andrei Olar
 **/
public class WindowDecorator extends Window {

	protected Window window;

	public WindowDecorator(Window window) {
		this.window = window;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}

}

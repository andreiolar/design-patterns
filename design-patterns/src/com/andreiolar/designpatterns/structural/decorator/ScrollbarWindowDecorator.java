package com.andreiolar.designpatterns.structural.decorator;

/**
 * @author Andrei Olar
 **/
public class ScrollbarWindowDecorator extends WindowDecorator {

	public ScrollbarWindowDecorator(Window window) {
		super(window);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Scrollbar");
		window.draw();
	}
}

package com.andreiolar.designpatterns.structural.bridge;

/**
 * @author Andrei Olar
 **/
public class DirectXWindowImpl extends WindowImpl {

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.println("Drawing on directx x:" + x + " y:" + y + " width:" + width + " height:" + height + " color:" + color);
	}
}

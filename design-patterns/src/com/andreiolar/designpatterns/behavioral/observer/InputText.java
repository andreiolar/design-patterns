package com.andreiolar.designpatterns.behavioral.observer;

/**
 * @author Andrei Olar
 **/
public class InputText implements Observer {

	public void setText(String text) {
		System.out.println("InputText set text: " + text);
	}

	@Override
	public void update() {
		this.setText("Button has been clicked.");
	}
}

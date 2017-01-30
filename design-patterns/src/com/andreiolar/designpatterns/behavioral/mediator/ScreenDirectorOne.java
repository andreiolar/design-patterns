package com.andreiolar.designpatterns.behavioral.mediator;

/**
 * @author Andrei Olar
 **/
public class ScreenDirectorOne implements ScreenDirector {

	private InputText inputText;

	@Override
	public void itemSelected(String item) {
		inputText.setValue(item);
	}

	public void setInputText(InputText inputText) {
		this.inputText = inputText;
	}
}

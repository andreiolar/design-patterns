package com.andreiolar.designpatterns.behavioral.mediator;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		List list = new List();
		InputText inputText = new InputText();

		ScreenDirectorOne screenDirector = new ScreenDirectorOne();
		screenDirector.setInputText(inputText);
		list.setScreenDirector(screenDirector);

		list.getItems().add("Data item one");
		list.getItems().add("Data item two");
		list.getItems().add("Data item three");

		list.selectItem(2);

		System.out.println("Selected value is: " + inputText.getValue());
	}
}

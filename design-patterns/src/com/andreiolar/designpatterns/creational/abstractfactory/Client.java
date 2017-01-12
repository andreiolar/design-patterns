package com.andreiolar.designpatterns.creational.abstractfactory;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		WidgetFactory factory = new PinkThemeWidgetFactory();
		initializeGUI(factory);

		factory = new YellowThemeWidgetFactory();
		initializeGUI(factory);
	}

	public static void initializeGUI(ScrollBar bar, Window window) {
		System.out.println("Do initialization logic here with " + bar.getClass().getName() + " and " + window.getClass().getName());
	}

	public static void initializeGUI(WidgetFactory factory) {
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}
}

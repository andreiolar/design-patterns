package com.andreiolar.designpatterns.creational.abstractfactory;

/**
 * @author Andrei Olar
 **/
public interface WidgetFactory {

	ScrollBar createScrollBar();

	Window createWindow();
}

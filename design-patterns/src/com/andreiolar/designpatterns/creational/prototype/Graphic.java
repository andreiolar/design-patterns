package com.andreiolar.designpatterns.creational.prototype;

/**
 * @author Andrei Olar
 **/
public abstract class Graphic {

	/**
	 * Creates a clone of this graphic object
	 * 
	 * @return A new Graphic object
	 **/
	@Override
	public abstract Graphic clone();

	public abstract String getUrl();
}

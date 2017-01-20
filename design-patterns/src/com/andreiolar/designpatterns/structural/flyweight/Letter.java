package com.andreiolar.designpatterns.structural.flyweight;

/**
 * @author Andrei Olar
 **/
public class Letter {

	private String value;

	public Letter(String value) {
		System.out.println("New letter created with value: " + value);
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

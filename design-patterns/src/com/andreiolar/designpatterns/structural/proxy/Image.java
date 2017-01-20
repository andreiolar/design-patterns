package com.andreiolar.designpatterns.structural.proxy;

/**
 * @author Andrei Olar
 **/
public class Image {

	protected String url;

	public Image() {
	}

	public Image(String url) {
		System.out.println("Loading image");
		this.url = url;
	}

	public void draw() {
		System.out.println("Draw image from url: " + url);
	}
}

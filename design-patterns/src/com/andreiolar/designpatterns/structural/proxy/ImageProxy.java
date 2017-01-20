package com.andreiolar.designpatterns.structural.proxy;

/**
 * @author Andrei Olar
 **/
public class ImageProxy extends Image {

	private Image image;

	public ImageProxy(String url) {
		super();
		this.url = url;
	}

	@Override
	public void draw() {
		if (image == null) {
			image = new Image(this.url);
		}
		super.draw();
	}
}

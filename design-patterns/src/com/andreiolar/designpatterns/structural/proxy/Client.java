package com.andreiolar.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		List<Image> images = Arrays.asList(new ImageProxy("test image"), new ImageProxy("test image 2"));

		Application application = new Application(images);
		application.draw();
	}
}

package com.andreiolar.designpatterns.additional.ioc;

/**
 * @author Andrei Olar
 **/
public class Container {

	private ImageService imageService;

	public void init() {
		imageService = new ImageService();
		imageService.setFileSystem(new WindowFileSystem());
	}

	public ImageService getImageService() {
		return imageService;
	}

	public static void main(String[] args) {
		Container container = new Container();
		container.init();
		ImageService imageService = container.getImageService();
		System.out.println(imageService.readImage());
	}
}

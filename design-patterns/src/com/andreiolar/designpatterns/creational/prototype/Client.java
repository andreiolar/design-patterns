package com.andreiolar.designpatterns.creational.prototype;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		Image image = new Image();
		image.setUrl("http://www.google.com");

		GraphicTool tool = new GraphicTool(image);
		Graphic graphic = tool.createGraphic();

		System.out.println("Graphic instance: " + graphic.getClass() + ". Url: " + graphic.getUrl());

		Video video = new Video();
		video.setUrl("htt://www.youtube.com");

		tool.setPrototype(video);
		graphic = tool.createGraphic();

		System.out.println("Graphic instance: " + graphic.getClass() + ". Url: " + graphic.getUrl());

	}
}

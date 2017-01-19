package com.andreiolar.designpatterns.structural.composite;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		GraphicItemGroup group = new GraphicItemGroup();

		group.getGraphics().add(line);
		group.getGraphics().add(rectangle);

		group.draw();

		Line line2 = new Line();
		GraphicItemGroup group2 = new GraphicItemGroup();

		group2.getGraphics().add(line2);
		group2.getGraphics().add(group);

		group2.draw();
	}
}

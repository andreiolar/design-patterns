package com.andreiolar.designpatterns.creational.prototype;

/**
 * @author Andrei Olar
 **/
public class GraphicTool {

	private Graphic prototype;

	/**
	 * Creates a graphic tool using a prototype.
	 * 
	 * @param prototype
	 *            The graphic prototype.
	 **/
	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	protected Graphic createGraphic() {
		return prototype.clone();
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}

}

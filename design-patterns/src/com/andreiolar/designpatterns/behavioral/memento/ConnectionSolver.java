package com.andreiolar.designpatterns.behavioral.memento;

import java.awt.geom.Point2D;

/**
 * @author Andrei Olar
 */
public class ConnectionSolver {

	private Point2D firstPoint;

	private Point2D secondPoint;

	public void calculateLine() {
		System.out.println("Calculate line between: " + firstPoint + " and " + secondPoint);
	}

	public void setFirstPoint(Point2D firstPoint) {
		this.firstPoint = firstPoint;
	}

	public void setSecondPoint(Point2D secondPoint) {
		this.secondPoint = secondPoint;
	}

	public ConnectionSolverMemento createMemento() {
		return new ConnectionSolverMemento(firstPoint, secondPoint);
	}

	public void setMemento(ConnectionSolverMemento memento) {
		this.firstPoint = memento.getFirstPoint();
		this.secondPoint = memento.getSecondPoint();
	}
}

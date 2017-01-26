package com.andreiolar.designpatterns.behavioral.strategy;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		Chess chess = new Chess();
		System.out.println("Calculate next step: " + chess.calculateNextStep());

		chess.setAlgorithm(new HardChessAlgorithm());
		System.out.println("Calculate next step: " + chess.calculateNextStep());
	}
}

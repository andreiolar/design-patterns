package com.andreiolar.designpatterns.behavioral.strategy;

/**
 * @author Andrei Olar
 **/
public class EasyChessAlgorithm implements ChessAlgorithm {

	@Override
	public int calculateNextStep() {
		return 1;
	}
}

package com.andreiolar.designpatterns.behavioral.strategy;

public class HardChessAlgorithm implements ChessAlgorithm {

	@Override
	public int calculateNextStep() {
		return 3;
	}
}

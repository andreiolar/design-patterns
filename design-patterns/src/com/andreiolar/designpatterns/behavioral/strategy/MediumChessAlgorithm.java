package com.andreiolar.designpatterns.behavioral.strategy;

public class MediumChessAlgorithm implements ChessAlgorithm {

	@Override
	public int calculateNextStep() {
		return 2;
	}
}

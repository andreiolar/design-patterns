package com.andreiolar.designpatterns.behavioral.template;

/**
 * @author Andrei Olar
 **/
public class CheapLoanCalculation extends LoanCalculationAlgorithm {

	@Override
	int getBaseAmount() {
		return 100000;
	}

	@Override
	double getInterest() {
		return 3;
	}

	@Override
	int calculateDiscount() {
		return 5000;
	}
}

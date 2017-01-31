package com.andreiolar.designpatterns.behavioral.template;

/**
 * @author Andrei Olar
 **/
public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm {

	@Override
	int getBaseAmount() {
		return 100000;
	}

	@Override
	double getInterest() {
		return 5.4;
	}

	@Override
	int calculateDiscount() {
		return 100;
	}
}

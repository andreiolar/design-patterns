package com.andreiolar.designpatterns.behavioral.template;

/**
 * @author Andrei Olar
 **/
public abstract class LoanCalculationAlgorithm {

	public int calculateLoan() {
		return (int) (getBaseAmount() * getInterest() - calculateDiscount());
	}

	abstract int getBaseAmount();

	abstract double getInterest();

	abstract int calculateDiscount();

}

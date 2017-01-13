package com.andreiolar.designpatterns.structural.facade;

/**
 * @author Andrei Olar
 **/
public class BillingSystem {

	public Bill createBill(Integer amount) {
		return new Bill(amount);
	}
}

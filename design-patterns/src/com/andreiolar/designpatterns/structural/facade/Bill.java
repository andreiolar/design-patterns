package com.andreiolar.designpatterns.structural.facade;

/**
 * @author Andrei Olar
 **/
public class Bill {

	private Integer amount;

	public Bill(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}
}

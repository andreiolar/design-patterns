package com.andreiolar.designpatterns.behavioral.cor;

/**
 * @author Andrei Olar
 **/
public abstract class CheckoutHandler {

	protected CheckoutHandler nextHandler;

	public abstract void handleCheckout();

	public void setNextHandler(CheckoutHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}

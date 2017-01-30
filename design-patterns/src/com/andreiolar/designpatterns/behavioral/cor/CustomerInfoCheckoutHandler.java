package com.andreiolar.designpatterns.behavioral.cor;

/**
 * @author Andrei Olar
 **/
public class CustomerInfoCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		System.out.println("Adding extra info to checkout of the customer.");

		if (nextHandler != null) {
			nextHandler.handleCheckout();
		}
	}
}

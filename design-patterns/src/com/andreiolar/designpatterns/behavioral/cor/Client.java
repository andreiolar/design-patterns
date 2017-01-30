package com.andreiolar.designpatterns.behavioral.cor;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		PaymentCheckoutHandler handler = new PaymentCheckoutHandler();
		CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();

		handler.setNextHandler(customerInfoCheckoutHandler);

		handler.handleCheckout();
	}
}

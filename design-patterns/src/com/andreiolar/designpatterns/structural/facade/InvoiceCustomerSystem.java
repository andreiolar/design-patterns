package com.andreiolar.designpatterns.structural.facade;

/**
 * @author Andrei Olar
 **/
public class InvoiceCustomerSystem {

	public void createInvoiceForBill(Bill bill) {
		System.out.println("Creating invoice for bill with amount: " + bill.getAmount());
	}
}
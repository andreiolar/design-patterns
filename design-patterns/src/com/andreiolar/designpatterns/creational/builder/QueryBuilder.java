package com.andreiolar.designpatterns.creational.builder;

/**
 * @author Andrei Olar
 **/
public interface QueryBuilder {

	void from(String from);

	void where(String where);

	Query getQuery();
}

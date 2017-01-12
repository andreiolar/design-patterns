package com.andreiolar.designpatterns.creational.builder;

/**
 * @author Andrei Olar
 **/
public class QueryBuildDirector {

	/**
	 * Used to create a query based on from and where.
	 * 
	 * @param from
	 *            The from
	 * 
	 * @param where
	 *            The where
	 * 
	 * @param builder
	 *            Used to define the end result of the query.
	 **/
	public Query buildQuery(String from, String where, QueryBuilder builder) {
		builder.from(from);
		builder.where(where);
		return builder.getQuery();
	}
}

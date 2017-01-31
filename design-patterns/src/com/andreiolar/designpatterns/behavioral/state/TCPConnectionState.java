package com.andreiolar.designpatterns.behavioral.state;

/**
 * @author Andrei Olar
 **/
public interface TCPConnectionState {

	void open();

	void close();

	void acknowledge() throws Exception;
}

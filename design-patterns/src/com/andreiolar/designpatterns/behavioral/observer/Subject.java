package com.andreiolar.designpatterns.behavioral.observer;

/**
 * @author Andrei Olar
 **/
public interface Subject {

	void attachObserver(Observer observer);

	void detachObserver(Observer observer);

	void change();
}

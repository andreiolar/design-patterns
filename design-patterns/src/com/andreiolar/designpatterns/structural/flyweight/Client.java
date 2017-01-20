package com.andreiolar.designpatterns.structural.flyweight;

/**
 * @author Andrei Olar
 **/
public class Client {

	public static void main(String[] args) {
		WordProcessor processor = new WordProcessor();

		String textToAdd = "jsidaj ojdaosj doajds oajd oasijd oaj oaj doiajsoijpo";
		int length = textToAdd.length();

		LetterFactory factory = new LetterFactory();

		for (int i = 0; i < length; i++) {
			String value = textToAdd.substring(i, i + 1);
			processor.addLetter(factory.createLetter(value));
		}

		processor.printLetters();
	}
}

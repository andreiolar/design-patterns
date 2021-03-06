package com.andreiolar.designpatterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Andrei Olar
 **/
public class TextEditor {

	private String text;

	private Queue<Command> queue = new LinkedList<>();

	private void executeAction(Command commad) {
		commad.action();
		queue.add(commad);
	}

	private void undo() {
		Command command = queue.poll();
		if (command != null) {
			command.undo();
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Queue<Command> getQueue() {
		return queue;
	}

	public void setQueue(Queue<Command> queue) {
		this.queue = queue;
	}

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.setText("1234");
		System.out.println("Text is: " + editor.getText());
		ClearTextCommand command = new ClearTextCommand(editor);
		editor.executeAction(command);

		System.out.println("Text is: " + editor.getText());
		editor.undo();
		System.out.println("Text is: " + editor.getText());

		AddTextCommand addTextCommand = new AddTextCommand(editor, "Something new");
		editor.executeAction(addTextCommand);

		System.out.println("Text is: " + editor.getText());
		editor.undo();
		System.out.println("Text is: " + editor.getText());
	}
}

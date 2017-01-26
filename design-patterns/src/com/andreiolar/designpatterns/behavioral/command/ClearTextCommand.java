package com.andreiolar.designpatterns.behavioral.command;

/**
 * @author Andrei Olar
 **/
public class ClearTextCommand extends AbstractCommand {

	private String undoText = "";

	public ClearTextCommand(TextEditor textEditor) {
		super(textEditor);
	}

	@Override
	public void action() {
		// First back up the undo text
		undoText = getTextEditor().getText();
		getTextEditor().setText("");
	}

	@Override
	public void undo() {
		getTextEditor().setText(undoText);
	}
}

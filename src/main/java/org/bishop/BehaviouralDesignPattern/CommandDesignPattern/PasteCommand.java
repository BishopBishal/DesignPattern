package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;

public class PasteCommand extends Command {


    /*
    * This class extends the command abstract class and then gives the implementation of the execute method.
    *
    * On the execute method it checks whether the editor clipboard variable of the editor class is empty or not if empty then returns false.
    *
    * Then it calls the backup method of the command class inside it which sets the backup variable of the command class by taking the value from the text field which is selected.
    *
    * then it takes the selected text from the clipboard variable of the editor class and set it to the text field.
    *
    * */

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
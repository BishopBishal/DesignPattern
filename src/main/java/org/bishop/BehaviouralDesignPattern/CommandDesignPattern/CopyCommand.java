package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;


public class CopyCommand extends Command {


    /*
    *
    * This class also extend the command class  and then execute its function which does following things
    *
    * It takes the selected text from the editor and then set it in the editor clipboard variable
    * */

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
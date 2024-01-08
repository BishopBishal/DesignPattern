package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;

public class CutCommand extends Command {



    /*
    *
    * This class also extends execute class so it must give the implementation of the execute method.
    *
    * Below is the implementation of the execute class
    *
    *
    *
    * */

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
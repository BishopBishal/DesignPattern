package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;


public abstract class Command {

    /*
    * @Author Bishop Bishal
    *
    * This command abstract class has two variables , one abstract method and two defined method
    *
    * editor variable is used because it has a set text method through we can set the value which
    * is backed up when we called the backup function
    *
    * backup variable is the variable where we have collected the backup of the selected text
    *
    *
    * backup function takes the selected text field from the editor class and save it in the backup variable
    *
    * undo function takes the backup variable value and set it into the text-field using the editor object
    *
    *Last but not the least there is the abstract execute method which each classes like cut,paste,copy etc class has its own implementation 
    *
    * */


    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}

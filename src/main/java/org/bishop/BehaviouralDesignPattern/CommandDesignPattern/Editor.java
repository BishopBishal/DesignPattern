package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {

    /*
    *
    * It has three variables and three methods
    *
    * One of the method is executeCommand method that takes the command parameter and call its execute method on it.Also on successfully completion of the command it push the command parameter in the stack in the commandHistory class.
    *
    * One of the method is undo where if the history stack is not empty then it pop the last command element from the history stack then it calls the undo of that command element.
    *
    *
    * one the init method it creates the dialog box and creates four button
    *   1)creates copy button and attach it to clt+c button and attach action which execute the execute method of the copy command class.
    *   1)creates cut button and attach it to clt+x button and attach action which execute the execute method of the cut command class.
    *   1)creates paste button and attach it to clt+v button and attach action which execute the execute method of the paste command class.
    *   1)creates undo button and attach it to clt+z button and attach action which calls undo function of this class only
    * .
    * */
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, BB!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
            System.out.println("Current size of the stack - "+history.size());
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        System.out.println("Current size of the stack - "+history.size());
        if (command != null) {
            command.undo();
        }
    }
}

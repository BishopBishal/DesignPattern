package org.bishop.BehaviouralDesignPattern.MediatorDesignPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {

    /*
     *
     * A SaveButton class is extending a JTextField and implement a Component interface, so it has to provide two methods (setMediator ,getName) body from component class, and it overrides one method processComponentKeyEvent body for JTextField class.
     *it has  one Mediator type variable which gets populated from setMediator method and one setName method it sets a name as SaveButton and returns it.
     *
     *
     * for processComponentKeyEvent method it takes a keyEvent but doesn't do anything with it rather it calls the markNote method from the mediator class.
     *
     * */
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
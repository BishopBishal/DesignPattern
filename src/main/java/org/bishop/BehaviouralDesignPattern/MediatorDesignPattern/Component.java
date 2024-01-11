package org.bishop.BehaviouralDesignPattern.MediatorDesignPattern;



/**
 * Common component interface.
 */
public interface Component {

    /*
    * Component interface has two methods one that takes Mediator but doesn't return anything now it's implementing class responsibility of its child classes to provide its body, and they can provide there individual body respectively.
    *
    *It also has a getName method which returns a String
    *
    * */


    void setMediator(Mediator mediator);
    String getName();
}
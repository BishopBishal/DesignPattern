package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;

import java.util.Stack;

public class CommandHistory {

    /*
    * In Command history class there is one stack data structure where it stores the Command types
    * of variables
    *
    * Is has three method
    *   1)Push -  to push the command into the stack.
    *   2)Pop - to pop the command variable from the stack.
    *   3)IsEmpty - to check where the stack is empty or not if empty then return true else false
    *
    * */
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }

    public int size(){return history.size();}
}
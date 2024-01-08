package org.bishop.BehaviouralDesignPattern.CommandDesignPattern;

public class Demo {

    /*
    *
    * Command is a behavioral design pattern that turns a request into a stand-alone
    * object that contains all information about the request. This transformation lets
    * you pass requests as a method arguments, delay or queue a request’s execution,
    * and support undoable operations.
    *
    * */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
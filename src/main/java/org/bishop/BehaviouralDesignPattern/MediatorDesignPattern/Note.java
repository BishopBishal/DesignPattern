package org.bishop.BehaviouralDesignPattern.MediatorDesignPattern;

public class Note {


    /*
    *
    * Note is a pojo class which has a name and text and has a constructor which says it names New note and buch of getter setters.
    *
    *
    * */

    private String name;
    private String text;

    public Note() {
        name = "New note";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return name;
    }
}
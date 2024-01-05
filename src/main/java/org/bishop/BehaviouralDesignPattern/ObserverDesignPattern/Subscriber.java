package org.bishop.BehaviouralDesignPattern.ObserverDesignPattern;

public class Subscriber implements Observer{

    private String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void notified() {
        System.out.println("Inside notified method --- Hey "+this.name+" this is to notify you that new " +
                "video got publised !!! Click to see");
    }
}

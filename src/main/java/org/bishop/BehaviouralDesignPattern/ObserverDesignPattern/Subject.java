package org.bishop.BehaviouralDesignPattern.ObserverDesignPattern;



public interface Subject {

    void subscribe(Observer ob);
    void unSubscribe(Observer ob);
    void notifyChanges();
}

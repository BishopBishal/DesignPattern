package org.bishop.BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

    private List<Observer> subscriberList=new ArrayList<>();
    @Override
    public void subscribe(Observer ob) {
        System.out.println("Inside subscribe method going to subscribe user = "+ob);
        subscriberList.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        System.out.println("Inside unSubscribe method going to unSubscribe user ="+ob);
        subscriberList.remove(ob);
    }

    @Override
    public void notifyChanges() {
        System.out.println("Inside notifyChanges going to notify all the user for the videos");
        subscriberList.stream().forEach(observer -> observer.notified());
    }
}

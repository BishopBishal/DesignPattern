package org.bishop.BehaviouralDesignPattern.ObserverDesignPattern;

public class Main {

    public static void main(String[] args) {

        /*
        *It is a behavioural Design pattern
        *
        * In this when the subject changes the state all its dependent objects notified the changes
        * one-to-many relation
        *
        * In the example we have taken the YouTube channel where the subscribers has subscribed to the
        * channel and then when the channel post some new videos all its subscribers got notified at once
        * that the new video has been posted go watch it !!!
        * */


        Youtube channel1=new Youtube();
        Subscriber ab =new Subscriber("abc");
        Subscriber ab2 =new Subscriber("def");
        Subscriber ab3 =new Subscriber("ghi");

        channel1.subscribe(ab);
        channel1.subscribe(ab2);
        channel1.subscribe(ab3);
        channel1.notifyChanges();

    }
}


package org.bishop.CreationalDesignPattern.PrototypeDesignPattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {


    /*
    *
    * Prototype Design Pattern - Is the design pattern which tells that if on creation of object if some
    * crucial and time-consuming task is happening then we should not do it again and again everytime.
    * we should execute that crucial and time-consuming task once, and then we should  clone that and use
    * that cloned task and use that everytime instead of creating the object again and again.
    *
    * It could be done by two ways
    *
    * 1) shallow clone-
    *        it is the default way where we clone the object and use it again and again but one
    *        thing we have to keep in mind is that if the object which we are cloning is having the
    *        object inside it like school class is having student object inside it or arraylist,map etc.
    *        then clone of that will not happen instead the reference of the student object will be
    *        passed while cloning.So if  something got changed inside the student object then it will
    *        reflect to all the cloned student class this is known as shallow cloning.
    *
    * 2) Deep clone-
    *
    *       It is a special way of cloning where we write a manual way to clone the student class
    *       where we specifically write a code to clone its inside object in this case student object.
    *
    * */

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        NetworkConnection networkConnection =new NetworkConnection();
        networkConnection.setIp("172.16.10.54");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Program Strated -- "+sdf.format(new Date()));
        networkConnection.loadData();
        System.out.println(sdf.format(new Date()) +"----"+0+"th original "+networkConnection);
        NetworkConnection networkConnection1=(NetworkConnection) networkConnection.clone();

        NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();

        NetworkConnection networkConnection3=(NetworkConnection) networkConnection.clone();


        networkConnection.getDomain().remove(1);
        System.out.println(sdf.format(new Date()) +"----"+0+"th original after removal "+networkConnection);
         System.out.println(sdf.format(new Date()) +"----"+1+"st copy "+networkConnection1);
        System.out.println(sdf.format(new Date()) +"----"+2+"st copy "+networkConnection2);
        System.out.println(sdf.format(new Date()) +"----"+3+"st copy "+networkConnection3);
        System.out.println("Program Ended -- "+sdf.format(new Date()));
    }

}


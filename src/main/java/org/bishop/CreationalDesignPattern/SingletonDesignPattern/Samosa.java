package org.bishop.CreationalDesignPattern.SingletonDesignPattern;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {

    private static Samosa samosa;


    /*
    * Lazy Initialization -- means the object will be available only when get method gets called.
    * How to implement Singleton Design Pattern Using Lazy Initialization
    * 1) Make the Constructor Private
    * 2)Make the static variable and get method to make the object
    * 3)Inside get method checks whether the variable has already valued or not
    * if not then create the object using new keyword and store it in the variable
    *  and then return same object and if not null then return the same variable.
    *
    * ** Now if we want to take multithreading environment into account then we have to modify
    * few more things and keep one or two more things into mind
    *
    *4) when using singletonDesignPattern into Multithreading environment we have to add synchronized
    *keyword when we are creation the new object because it could happen that two method simultaneously
    * when we are calling getSamosa method of samosa it could happen that two threads while checking the variable
    * samosa value both got null and then both create the object using new keyword which we have to restrict.
    *
    * */

  /*
  How to make Constructor Safe From Reflection API so that Singleton Design doesn't break

   private Samosa() throws IllegalAccessException {

        *//*
        * To be safe from the Reflection API
        * *//*
        if(Samosa.samosa!=null)
        {
            throw new IllegalAccessException("Samosa Object is already present ");
        }

    }*/


    private Samosa() {

    }
    /*
    *
    * Non ThreadSafe Implementation / For Single Threaded Environment
    *
    * public static Samosa getSamosa()
    {
      //  System.out.println("Inside GetSamosa Function - "+Samosa.samosa);
        if(Samosa.samosa==null)
        {

           Samosa.samosa=new Samosa();
           return Samosa.samosa;
        }
        return Samosa.samosa;
    }
    * */


    //ThreadSafe Implementation
    public static Samosa getSamosa() throws IllegalAccessException {
      //  System.out.println("Inside GetSamosa Function - "+Samosa.samosa);
        if(Samosa.samosa==null)
        {

            synchronized (Samosa.class)
            {
                if(Samosa.samosa==null)
                    Samosa.samosa=new Samosa();
            }
        }
        return Samosa.samosa;
    }

    //To not get broke from the Serialization /Deserialization
    public Object readResolve()
    {
        return Samosa.samosa;
    }

    //To not get broke from the clone function
    @Override
    public Object clone() throws CloneNotSupportedException {
        //Normal way to break Singleton Design pattern
//        return super.clone();


        //Safe way to not break Singleton Design Pattern
        return Samosa.samosa;
    }
}

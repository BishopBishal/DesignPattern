package org.bishop.CreationalDesignPattern.SingletonDesignPattern;

public class Jalebi {

    /*
    *Eager Initialization -- means the object will be available when the program gets loaded in the stack.
    * How to implement Singleton Design Pattern Using Eager Initialization
    *
    *
    * */

    private static Jalebi jalebi =new Jalebi();


    public static Jalebi getJalebi()
    {
        return Jalebi.jalebi;
    }
}

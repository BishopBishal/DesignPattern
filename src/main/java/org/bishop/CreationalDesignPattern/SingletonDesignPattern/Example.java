package org.bishop.CreationalDesignPattern.SingletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        //Lazy Implementation of the Singleton Design Pattern
        System.out.println(Samosa.getSamosa().hashCode());
        System.out.println(Samosa.getSamosa().hashCode());

        System.out.println("--------------------||-------------------");

        //Eager Implementation of the Singleton Design Pattern
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());


        /*
        * How to break Singleton Design
        *
        * 1) Using Reflection API to Break Singleton Design Pattern
        *
        *   Samosa s1=Samosa.getSamosa();
            System.out.println("Reflection Api Example - "+s1.hashCode());
            Constructor<Samosa> s2 =Samosa.class.getDeclaredConstructor();
            s2.setAccessible(true);
            System.out.println("Reflection Api Example - "+s2.newInstance().hashCode());
        *
        *
        *       Solution  to not get broke from the Reflection API
        *
        *       1) In Constructor If object is there then throw the exception to Illegal Action
        *       2)Use Enum
        *
        *       Both Solutions are mentioned below
        *
        *
        * 2) Using Deserialization and Serialization we are also break Singleton Design Pattern
        *
        *       Samosa s1 =Samosa.getSamosa();
                System.out.println("Before Serialization -- "+s1.hashCode());
                ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("abc.ob"));
                oos.writeObject(s1);

                System.out.println("----- Serialization Done ----");

                ObjectInputStream ois =new ObjectInputStream(new FileInputStream("abc.ob"));
                Samosa s2 = (Samosa) ois.readObject();
                System.out.println("----- Deserialization Done -----");
                System.out.println("After Serialization -- "+s2.hashCode());

        *
        *
        *
        *       Solution to not break from serialization/Deserialization
        *           1) implement the readResolve Method
        *
        *
        * 3)Object Cloning could be used to break the singleton design pattern
        *
        *
        *
        * */






        //For Solution 1 that throws exception
      /*  Samosa s1=Samosa.getSamosa();
        System.out.println("Reflection Api Example - "+s1.hashCode());
        Constructor<Samosa> s2 =Samosa.class.getDeclaredConstructor();
        s2.setAccessible(true);
        System.out.println("Reflection Api Example - "+s2.newInstance().hashCode());*/

//        For Solution 2 Using Enum
      /*  SamosaEnum s1 =SamosaEnum.Instance;
        System.out.println("Reflection Api Object - "+s1.hashCode());
        s1.test();
        Constructor<SamosaEnum> s2 =SamosaEnum.class.getDeclaredConstructor();
        s2.setAccessible(true);
        System.out.println("Reflection Api Object - "+s2.newInstance());*/


        //Serialization/DeSerialization way to break Singleton Pattern
/*

        Samosa s1 =Samosa.getSamosa();
        System.out.println("Before Serialization -- "+s1.hashCode());
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        System.out.println("----- Serialization Done ----");

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2 = (Samosa) ois.readObject();
        System.out.println("----- Deserialization Done -----");
        System.out.println("After Serialization -- "+s2.hashCode());
*/


        //Using Clone function to not break Singleton way
        Samosa s1 =Samosa.getSamosa();
        System.out.println("Before Cloning -- "+s1.hashCode());
        Samosa s2 = (Samosa) s1.clone();
        System.out.println("After Cloning -- "+s2.hashCode());

    }
}

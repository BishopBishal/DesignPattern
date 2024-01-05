package org.bishop.BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Main {


    /*
    *
    * It is also a Behaviour Design pattern means it tells how to interact between the objects.
    *
    * It is Iterator Design Pattern -
    *
    *   It is design which provides a way to access the object without exposing its underlying
    *   implementation.
    *   Basically It provides an interface which has two method to access the element
    *   1) hasNext() - This returns the boolean means true if the current collection of object has some
    *                   more values present or false if you have iterated all the list.
    *
    *   2)next() - This function returns the next value in the collection of object while traversing.
    *
    *
    * */


    public static void main(String[] args) {
        List<User> userList = Arrays.asList
                (new User("abc", (int) System.currentTimeMillis(),"london")
                        ,new User("def",(int) System.currentTimeMillis(),"china")
                        ,new User("ghi" ,(int) System.currentTimeMillis(),"africa")
                        ,new User("klm",(int) System.currentTimeMillis(),"Combodia"));

        MyIterator itr =new MyIteratorImpl(userList);

        while(itr.hasNext())
        {
            System.out.println("user -> "+itr.next());
        }
    }


}

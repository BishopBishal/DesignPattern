package org.bishop.CreationalDesignPattern.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {



        /*
        * Builder Design pattern -
        *
        * Best for making immutable objects as you can make the final variables
        * which gets initalize once and then cannot be changed so this pattern could be opted if you want immutable
        * objects
        *
        * There was a problem in factory design pattern and abstract factory design pattern when we were
        * passing the argument directly into factory method to get the object but what if there were 100 of
        * parameters and passing those parameter with certain order will be a haptic task.Also, if some variable
        * optional then we have to make another constructor without that variable will make this process lengthy.
        *
        * so Builder pattern lets to set the variable values one by one with the setter easily
        * Also this will be useful if you want to make the object immutable
        *
        *
        *
        * */


        User user1 = new User.UserBuilder()
                .setUserId("1").setUserName("abc")
                .setEmailId("abc@gmail.com")
                .build();
        System.out.println(user1);
        System.out.println(" ----------------||----------------- ");
        User user2= new User.UserBuilder().setUserId("2")
                .setUserName("def")
                .setEmailId("def@gmail.com")
                .build();
        System.out.println(user2);
    }
}

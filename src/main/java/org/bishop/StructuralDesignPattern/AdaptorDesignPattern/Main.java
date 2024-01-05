package org.bishop.StructuralDesignPattern.AdaptorDesignPattern;

public class Main {

    public static void main(String[] args) {

        /*
        *
        *
        * This is also a Behavioural Design Pattern
        *
        * Adaptor Design Pattern -
        *       With the given example we can truly understand the working of adaptor design pattern
        *       We have provided with the iphone, but we don't have the Apple charger instead we have
        *       android charger but usually iphone phones doesn't support android charger, so we will
        *       to use adaptor to charger the iphone which internally provides a interface of Apple
        *       charger but internally chargers with the android charger.
        *
        *
        * */

        //Normal Case Implementation where we have the Apple charger
        Iphone13 iphone13=new Iphone13(new ChargerCoreApple());
        iphone13.chargePhone();

        //Case where we don't have Apple charger, so we have to use adapter
        AndroidCharger androidCharger = new LocalAndroidCoreCharger();
//        This will cause error because apple needs Apple charger, but you provided androidCharger
//        Iphone13 iphone13new=new Iphone13(androidCharger);
        Iphone13 iphone13new=new Iphone13(new AppleToAndroidAdaptor(androidCharger));
        iphone13new.chargePhone();

    }
}

package org.bishop.StructuralDesignPattern.AdaptorDesignPattern;

public class LocalAndroidCoreCharger implements AndroidCharger{
    @Override
    public void chargePhone() {
        System.out.println("your phone is charging with local android charger");
    }
}

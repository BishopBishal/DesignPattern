package org.bishop.BehaviouralDesignPattern.AdaptorDesignPattern;

public class ChargerCoreApple implements IphoneCharger{
    @Override
    public void chargePhone() {
        System.out.println("phone is Charging with apple charger");
    }
}

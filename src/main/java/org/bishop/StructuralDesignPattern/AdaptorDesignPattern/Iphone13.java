package org.bishop.StructuralDesignPattern.AdaptorDesignPattern;

public class Iphone13 {
    private IphoneCharger iphoneCharger;

    public Iphone13(IphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    public void chargePhone()
    {
        System.out.println("iphone phone is going to core to charge");
        iphoneCharger.chargePhone();

    }
}

package org.bishop.StructuralDesignPattern.AdaptorDesignPattern;

public class AppleToAndroidAdaptor implements IphoneCharger{

    private AndroidCharger androidCharger;

    public AppleToAndroidAdaptor(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        System.out.println("Using Apple to Android Adaptor to Charge");
        this.androidCharger.chargePhone();
    }
}

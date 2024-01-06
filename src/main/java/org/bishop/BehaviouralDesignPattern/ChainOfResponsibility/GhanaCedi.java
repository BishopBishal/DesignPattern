package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

public class GhanaCedi extends CurrencyExchange {

    private int currency;

    public GhanaCedi(int currency) {
        this.currency = currency;
    }

    @Override
    public boolean printCountryCurrency() {
        double v= 6.99;
        v =currency/v;
        System.out.println("Your Ghana Cedi is - "+v);
        return convertNext();
    }
}

package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

public class ChainYuan extends CurrencyExchange{
    private int currency;

    public ChainYuan(int currency) {
        this.currency = currency;
    }


    @Override
    public boolean printCountryCurrency() {
        double v=11.85;
        v= currency/v;
        System.out.println("Chinese Yuan corresponding value is - "+v);
        return convertNext();
    }
}

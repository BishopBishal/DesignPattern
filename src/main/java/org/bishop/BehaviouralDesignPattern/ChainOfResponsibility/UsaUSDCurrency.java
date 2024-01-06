package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

public class UsaUSDCurrency extends CurrencyExchange{

    private int currency;

    public UsaUSDCurrency(int currency) {
        this.currency = currency;
    }

    @Override
    public boolean printCountryCurrency() {
        Double v= currency / 83.19;
        System.out.println("Your American Dollar Conversion is - "+v);
        return convertNext();
    }
}

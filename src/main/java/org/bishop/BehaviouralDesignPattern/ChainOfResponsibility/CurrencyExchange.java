package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

public abstract class CurrencyExchange {

    private CurrencyExchange nextCurrencyExchange;

    public static CurrencyExchange linkCurrency(CurrencyExchange first , CurrencyExchange... chain)
    {
//        System.out.println("Class name - "+first.getClass().getName());
        CurrencyExchange head=first;
        for(CurrencyExchange nextInChainCurrency:chain)
        {
            head.nextCurrencyExchange=nextInChainCurrency;
//            System.out.println("next class name - "+head.nextCurrencyExchange.getClass().getName());
            head=nextInChainCurrency;
//            System.out.println("head pointing to - "+nextInChainCurrency.getClass().getName());
        }
        return first;
    }

    public abstract boolean printCountryCurrency();

    public boolean convertNext()
    {
        if(nextCurrencyExchange==null)
            return false;
        else
            return nextCurrencyExchange.printCountryCurrency();
    }
}

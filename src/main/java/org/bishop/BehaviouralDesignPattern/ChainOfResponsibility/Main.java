package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the money in inr - ");
        int inrCurrency = Integer.valueOf(reader.readLine());
        System.out.println("Your inrCurrency value is - " +inrCurrency);
//        System.out.println("Showing its value in other world currency - ");
        CurrencyExchange currencyExchange = CurrencyExchange.linkCurrency(new UsaUSDCurrency(inrCurrency)
                , new ChainYuan(inrCurrency),new GhanaCedi(inrCurrency));
     currencyExchange.printCountryCurrency();
    }
}

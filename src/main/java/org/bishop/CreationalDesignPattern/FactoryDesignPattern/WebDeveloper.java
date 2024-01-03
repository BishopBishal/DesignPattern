package org.bishop.CreationalDesignPattern.FactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Web Developer Salary - "+90+"K");
        return 90;
    }
}

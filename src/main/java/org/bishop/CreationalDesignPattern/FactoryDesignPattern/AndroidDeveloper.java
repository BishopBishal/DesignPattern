package org.bishop.CreationalDesignPattern.FactoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Android Developer Salary - "+80+"K");
        return 80;
    }
}

package org.bishop.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        return 80;
    }

    @Override
    public String Name() {
        System.out.println("This is Android Developer");
        return "Android Developer";
    }
}

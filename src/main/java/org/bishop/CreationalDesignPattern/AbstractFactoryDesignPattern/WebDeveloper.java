package org.bishop.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        return 90;
    }

    @Override
    public String Name() {
        System.out.println("This is Web Developer");
        return "Web Developer";
    }
}

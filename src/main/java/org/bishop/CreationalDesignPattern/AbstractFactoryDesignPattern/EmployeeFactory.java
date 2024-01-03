package org.bishop.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory)
    {
        return factory.createEmployee() ;
    }
}

package org.bishop.CreationalDesignPattern.FactoryDesignPattern;

public class EmployeeFactory {

    /*
    * Factory Design Pattern - This design pattern could be opted if you have one super class and
    * multiple subclass and we want object of subclass based on the input and requirement
    *
    * Advantages of Factory Design Pattern
    * 1) Focus on creating the object of interface rather than implementation
    * 2)Lose Coupling and more Robust code
    * */
    public static Employee getEmployee(String employeeType)
    {
        if(employeeType.equalsIgnoreCase("Android"))
            return new AndroidDeveloper();
        else if (employeeType.equalsIgnoreCase("web")) {
            return new WebDeveloper();
        }
        else
            return null;
    }
}

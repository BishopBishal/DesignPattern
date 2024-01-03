package org.bishop.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Client {

    public static void main(String[] args) {



        /*
        * This Abstract Factory Design is more like Factory Design pattern but still there is some
        * things differ from Factory Design pattern
        * 1) It adds an abstract layer at Employee Factory .
        * 2) It adds an Employee Abstract Factory which is  factory of factories.
        * */
        Employee androidEmployee = EmployeeFactory.getEmployee(AndroidDeveloper::new);
        Employee webEmployee = EmployeeFactory.getEmployee(WebDeveloper::new);

        System.out.println(androidEmployee.Salary() + "-----"+androidEmployee.Name());
        System.out.println(webEmployee.Salary() + "-----"+webEmployee.Name());
    }
}

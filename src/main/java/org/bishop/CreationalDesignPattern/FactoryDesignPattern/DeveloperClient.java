package org.bishop.CreationalDesignPattern.FactoryDesignPattern;

public class DeveloperClient {

    public static void main(String[] args) {
   /*     Employee e1 =new AndroidDeveloper();
        e1.Salary();
        Employee e2 = new WebDeveloper();
        e2.Salary();*/

        Employee web = EmployeeFactory.getEmployee("Web");
        web.Salary();
        Employee android = EmployeeFactory.getEmployee("Android");
        android.Salary();


    }

}

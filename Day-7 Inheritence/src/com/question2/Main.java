package com.question2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Bhanu";
        employee.address = "Hyderabad";
        employee.salary = 14.5;
        employee.age = 23;
        employee.specialisation = "Backend";
        employee.department = "Software";
        employee.printData();

        System.out.println("_______________________________");
        Manager manager = new Manager();
        manager.name = "Prathap";
        manager.address = "Delhi";
        manager.salary = 36;
        manager.age = 25;
        manager.specialisation = "Manager";
        manager.department = "HR";
        manager.printData();
    }
}

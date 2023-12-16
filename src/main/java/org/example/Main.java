package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        System.out.println("------------------------------------------");
        Employee employee = manager.getEmployee(1);
        System.out.println(employee);

        System.out.println("------------------------------------------");
        for(var empl : manager.getEmployees()) {
            System.out.println(empl);
        }

        System.out.println("------------------------------------------");
        Employee employee2 = new Employee("last name", "first name", LocalDate.now(), "photo.png", "Notes...");
        System.out.println(manager.addEmployee(employee2));

        System.out.println("------------------------------------------");
        Employee employee3 = new Employee(20, "last name1", "first name1", LocalDate.now(), "photo.png", "Notes...");
        System.out.println(manager.deleteEmployee(employee3));

        System.out.println("------------------------------------------");
        Employee employee4 = new Employee(21, "last name1", "first name1", LocalDate.now(), "photo.png", "Notes...");
        System.out.println(manager.updateEmployee(employee4));
    }
}
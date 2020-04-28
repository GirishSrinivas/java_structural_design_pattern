package com.girish.structuralDesignPattern.adapterPattern;

import java.util.List;

public class AdapterDemoApp {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println("Employee List : " + employees);
    }
}

package com.girish.structuralDesignPattern.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        EmployeeLdap ldapEmployee = new EmployeeLdap("chewy", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeLdapAdapter(ldapEmployee));

        EmployeeCSV employeeCSV = new EmployeeCSV("9876, Girish, Srinivas, girish@srinivas.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));
        return employees;
    }
}

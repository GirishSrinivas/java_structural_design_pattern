package com.girish.structuralDesignPattern.adapterPattern;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV employeeCSV;
    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getID() {
        return Integer.toString(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmail();
    }
}

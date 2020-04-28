package com.girish.structuralDesignPattern.adapterPattern;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap ldapEmployee;
    public EmployeeLdapAdapter(EmployeeLdap ldapEmployee) {
        this.ldapEmployee = ldapEmployee;
    }

    @Override
    public String getID() {
        return ldapEmployee.getCn();
    }

    @Override
    public String getFirstName() {
        return ldapEmployee.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldapEmployee.getSurname();
    }

    @Override
    public String getEmail() {
        return ldapEmployee.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeLdapAdapter{" +
                "cn='" + ldapEmployee.getCn() + '\'' +
                ", givenName='" + ldapEmployee.getGivenName() + '\'' +
                ", surname='" + ldapEmployee.getSurname() + '\'' +
                ", mail='" + ldapEmployee.getMail() + '\'' +
                '}';
    }
}

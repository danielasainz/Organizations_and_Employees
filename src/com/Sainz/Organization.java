package com.Sainz;

import java.util.ArrayList;

public class Organization {
    private String organizationName;
    //Included the Array List below first
    private ArrayList<Employee> theEmployees;

    //default constructor
    public Organization()
    {
        theEmployees = new ArrayList<>();
    }

    //overloaded constructor
    public Organization(String organizationName) {
        this.organizationName = organizationName;
        theEmployees = new ArrayList<>();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    public ArrayList<Employee> getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(ArrayList<Employee> theEmployees) {
        this.theEmployees = theEmployees;
}

    public void addEmployee(Employee employee)
    {
        theEmployees.add(employee);
    }
}
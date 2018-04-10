package com.Sainz;

public class Employee {
    private String employeeNumber;
    private String employeeFirstName;
    private String employeeLastName;

    /*
       public Course() {
    }

    public Course(String courseNumber, String courseName) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    public Course(String courseNumber, String courseName, String roomNumber)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.roomNumber = roomNumber;
    }
     */

    //unclear why this is in here - an overloaded constructor for fewer variables?

    public Employee(String employeeNumber, String employeeFirstName) {
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
    }

    public Employee(String employeeNumber, String employeeFirstName, String employeeLastName) {
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
    }

    public Employee(){
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
}

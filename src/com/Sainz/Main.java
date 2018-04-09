package com.Sainz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        //unsure if below is best way to initialize the variable
        //unsure if below is best way to initialize the variable
        Employee newEmployee;
        Organization newOrganization;
        String answer = "";

        ArrayList<Organization> organizations = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        newOrganization = new Organization();
        System.out.println("Enter an organization's name:");
        newOrganization.setOrganizationName(keyboard.nextLine());

        System.out.println('\n' + "Your organization is called: " + newOrganization.getOrganizationName());

        do {
            newEmployee = new Employee();
            System.out.println('\n' + "Enter an employee's number:");
            newEmployee.setEmployeeNumber(keyboard.nextLine());

            System.out.println("Enter an employee's first name:");
            newEmployee.setEmployeeFirstName(keyboard.nextLine());

            System.out.println("Enter an employee's last name:");
            newEmployee.setEmployeeLastName(keyboard.nextLine());

            System.out.println('\n' + "Your employee's number is: " + newEmployee.getEmployeeNumber() + '\n' +
                    "Your employee's first name is: " + newEmployee.getEmployeeFirstName() + '\n' + "Your employee's last name is: "
                    + newEmployee.getEmployeeLastName());

            employees.add(newEmployee);

            System.out.println('\n' + "Would you like to enter another employee's information?");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }
        } while (done);

        System.out.println("=============");
        System.out.println("Organization name: " + newOrganization.getOrganizationName());
        System.out.println('\n' + "Information about various employees: ");
        //REMEMBER THAT YOU CANNOT USE A SEMI-COLON BELOW! MUST BE A CURLY BRACE!
        for (Employee eachEmployee : employees) {
            {
                System.out.println('\n' + "Your employee's number is: " + eachEmployee.getEmployeeNumber() + '\n' +
                        "Your employee's first name is: " + eachEmployee.getEmployeeFirstName() + '\n' + "Your employee's last name is: "
                        + eachEmployee.getEmployeeLastName());
            }

        }
    }
}




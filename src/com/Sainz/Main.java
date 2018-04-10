package com.Sainz;


//why - below?
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Employee newEmployee;
        Organization newOrganization;
        // Institution anInstitution;
        // Course aCourse;
        String employeeAnswer = "";
        String organizationAnswer = "";
        boolean employeeDone = false;
        boolean organizationDone = false;

        ArrayList<Organization> allOrganizations = new ArrayList<>();

        //ArrayList<Employee> employees = new ArrayList<>(); - only one Array List here

        do {
            newOrganization = new Organization();
            System.out.println("Enter an organization's name:");
            newOrganization.setOrganizationName(keyboard.nextLine());

            System.out.println('\n' + "Your organization is called: " + newOrganization.getOrganizationName());

        /*
        do{

                        aCourse = new Course();
                        System.out.println("Enter course title:");
                        aCourse.setCourseName(keyboard.nextLine());

                        System.out.println("Enter course number:");
                        aCourse.setCourseNumber(keyboard.nextLine());

                        System.out.println("Enter room number");
                        aCourse.setRoomNumber(keyboard.nextLine());

                        System.out.println("Your course details: Course Name:"+aCourse.getCourseName()+" Room Number:"+aCourse.getRoomNumber()+" Course Number:"+aCourse.getCourseNumber());

                        anInstitution.addCourse(aCourse);

                        System.out.println("Do you want to enter details for another course?");
                        courseAnswer=keyboard.nextLine();

                        if(courseAnswer.equalsIgnoreCase("no")||courseAnswer.equalsIgnoreCase("n"))
                            courseDone = true;
         */


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

                //had to modify below line from original code
                newOrganization.addEmployee(newEmployee);

                System.out.println('\n' + "Would you like to enter another employee's information?");
                employeeAnswer = keyboard.nextLine();
                if (employeeAnswer.equalsIgnoreCase("y") || employeeAnswer.equalsIgnoreCase("yes")) {
                    employeeDone = true;
                } else {
                    employeeDone = false;
                }
            } while (employeeDone);

            //Add Organization to the array list of organizations
            allOrganizations.add(newOrganization);


            System.out.println("Do you want to enter another organization");
            organizationAnswer = keyboard.nextLine();
            if (organizationAnswer.equalsIgnoreCase("y") || organizationAnswer.equalsIgnoreCase("yes")) {
                organizationDone = true;
            } else {
                organizationDone = false;
            }
        } while (organizationDone);

        /*

         for (Institution eachInstitution:allInstitutions) {
            System.out.println("These are courses for "+eachInstitution.getName());
            for(Course eachCourse:eachInstitution.getTheCourses())
            {
                System.out.println(" These are the details of the course: Course Number:"+eachCourse.getCourseNumber()+" Title:"+eachCourse.getCourseName()+" Room:"+eachCourse.getRoomNumber());
            }
        }
         */


        for (Organization eachOrganization : allOrganizations) {
            System.out.println('\n' + "These are employees for: " + eachOrganization.getOrganizationName());
            for (Employee eachEmployee : eachOrganization.getTheEmployees()) {

                System.out.println('\n' + "These are the details of the employee: " + '\n' + '\n' + "Employee number: " + eachEmployee.getEmployeeNumber() + '\n' + "Employee first name: " + eachEmployee.getEmployeeFirstName()
                        + '\n' + "Employee last name: " + eachEmployee.getEmployeeLastName());
            }
        }
    }
}

/*


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

*/



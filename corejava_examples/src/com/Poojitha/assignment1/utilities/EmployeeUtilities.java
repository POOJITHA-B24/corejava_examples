package com.Poojitha.assignment1.utilities;
import com.Poojitha.assignment1.employees.Developer;
import com.Poojitha.assignment1.employees.Manager;

public class EmployeeUtilities {
	public void printEmployeeDetails(Manager manager) {
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }

    public void printEmployeeDetails(Developer developer) {
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}



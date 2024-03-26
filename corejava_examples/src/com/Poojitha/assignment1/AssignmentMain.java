package com.Poojitha.assignment1;

public class AssignmentMain {

	public static void main(String[] args) {
		com.Poojitha.assignment1.employees.Manager manager = new com.Poojitha.assignment1.employees.Manager();
        manager.setName("POOJITHA B");
        manager.setEmployeeId(1001);
        manager.setSalary(90000);
        manager.setDepartment("Engineering");

        com.Poojitha.assignment1.employees.Developer developer = new com.Poojitha.assignment1.employees.Developer();
        developer.setName("ARUN");
        developer.setEmployeeId(1002);
        developer.setSalary(90000);
        developer.setProgrammingLanguage("Java");

        com.Poojitha.assignment1.utilities.EmployeeUtilities employeeUtilities = new com.Poojitha.assignment1.utilities.EmployeeUtilities();
        employeeUtilities.printEmployeeDetails(manager);
        employeeUtilities.printEmployeeDetails(developer);// TODO Auto-generated method stub

	}

}

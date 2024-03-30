package com.Poojitha.assignment1;
import java.util.Scanner;

public class StudentDetails {
	    public StudentDetails() {
	        System.out.println("Student object is created");
	    }
	}

	class Commission {
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    public void acceptDetails() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name:");
	        name = scanner.nextLine();
	        System.out.println("Enter Address:");
	        address = scanner.nextLine();
	        System.out.println("Enter Phone:");
	        phone = scanner.nextLine();
	        System.out.println("Enter Sales Amount:");
	        salesAmount = scanner.nextDouble();
	    }

	    public void calculateCommission() {
	        double commission = 0.0;
	        if (salesAmount >= 1_00_000) {
	            commission = 0.10 * salesAmount;
	        } else if (salesAmount >= 50_000) {
	            commission = 0.05 * salesAmount;
	        } else if (salesAmount >= 30_000) {
	            commission = 0.03 * salesAmount;
	        }
	        System.out.println("Commission: $" + commission);
	    }
	}
	
	

	



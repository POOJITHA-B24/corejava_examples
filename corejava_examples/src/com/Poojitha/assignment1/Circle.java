package com.Poojitha.assignment1;
import java.util.Scanner;
public class Circle {
	  double radius;
	  String colour;
	void getInput()
	{
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter radius of the circle:");
	        radius = scanner.nextDouble();

	        scanner.nextLine(); 

	        System.out.println("Enter colour of the circle:");
	        colour = scanner.nextLine();
	    }

	    
	    public void calcArea() {
	        double area = 3.14 * radius * radius;
	        System.out.println("Area of the circle with radius " + radius + " and colour " + colour + " is: " + area);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Circle circle = new Circle();
	        circle.getInput();
	        circle.calcArea();
	    }
	
		
	}



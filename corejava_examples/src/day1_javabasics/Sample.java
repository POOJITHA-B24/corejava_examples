package day1_javabasics;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a and b value:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("value of a="+a+"and value of b="+b+"multiplication of a and b is:"+c);
		
	}

}

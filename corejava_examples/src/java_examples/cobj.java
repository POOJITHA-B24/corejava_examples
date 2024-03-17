package java_examples;
import java.io.*;
import java.util.*;

public class cobj {
	int a;
	int b;
	int c;
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value");
		a=sc.nextInt();
		System.out.print("enter b value");
		b=sc.nextInt();
	}
	public void  add()
	{
	c=a+b;
	System.out.println("c="+c);
	
	}
	public static void main(String args[])
	{
		
	cobj obj=new cobj();
	obj.get();
	obj.add();
	
}
}

	

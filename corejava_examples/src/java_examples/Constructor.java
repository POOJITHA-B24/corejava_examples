package java_examples;

public class Constructor {
	int roll_no,age;
	String name;
	String dept;
	String result;
 Constructor(int a,int b,String r,String s)
{
roll_no=a;
age=b;
name=r;
dept=s;
}
 public void display()
 {
	 result=name+" "+dept;
	 System.out.println(result);
	 
 }
 
public static void main(String args[])
{
Constructor obj =new Constructor(298,20,"ARUN","CSE");
System.out.println(obj.roll_no+ " \n" +obj.name+" \n"+obj.age+"\n"+obj.dept);
obj.display();

}

	

}

package MultipleInheritance;

public class MultilevelDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Atharv", 7878767676l,int(2000, 12, 2));
		System.out.println(p1);

		p1 = new Employee("Pranav", 8080807070l, int (1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l, int (1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);
	}



	}



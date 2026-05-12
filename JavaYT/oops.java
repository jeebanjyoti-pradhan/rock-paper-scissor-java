package JavaYT;

class employee {
	int id;
	String name;
	int salary;

	public void printDetails() {
		System.out.print("my id is " + id);
		System.out.println(" and my name is " + name);
	}

	public int getSalary() {
		return salary;
	}
}

public class oops {
	public static void main(String[] args) {
		System.out.println("priya");
		employee jeeban = new employee();// initiating the object
		employee jyoti = new employee();// initiating the object
		// setting attributes
		jeeban.id = 101;
		jeeban.name = "pradhan";
		jeeban.salary = 32;

		jyoti.id = 123;
		jyoti.name = "oggy";
		jyoti.salary = 45;

		// calling the method
		jeeban.printDetails();
		jyoti.printDetails();
		int salary = jyoti.getSalary();
		System.out.println( "Salary of oggy is "+salary+ ".");
		int salary1 = jeeban.getSalary();
		System.out.println("Salary of jeeban is "+ salary1 +".");

		// printing the attributes

		// System.out.println(jeeban.id);
		// System.out.println(jeeban.name);
	}

}

package Task2;

class Person {

	protected String name;
	protected int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
}

class Employee extends Person {

	int employeeID;
	double salary;

	Employee(String name, int age, int employeeID, double salary) {

		super(name, age);
		this.employeeID = employeeID;
		this.salary = salary;

	}
}

public class Q4 {

	public static void main(String[] args) {
		System.out.println("===============================================");
		Employee emp1 = new Employee("Harish", 28, 6479, 10000);
		System.out.println("Employee Name: " + emp1.name);
		System.out.println("Employee Age: " + emp1.age);
		System.out.println("Employee ID: " + emp1.employeeID);
		System.out.println("Employee Salary: Rs" + emp1.salary);
		System.out.println("===============================================");

		Employee emp2 = new Employee("Gokul", 45, 2456, 25000);
		System.out.println("Employee Name: " + emp2.name);
		System.out.println("Employee Age: " + emp2.age);
		System.out.println("Employee ID: " + emp2.employeeID);
		System.out.println("Employee Salary: Rs" + emp2.salary);
	}

}
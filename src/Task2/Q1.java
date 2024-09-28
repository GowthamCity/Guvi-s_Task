package Task2;

public class Q1 {

	private String name;
	private int age;

	public Q1() {

		this.age = 18;

	}

	public Q1(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void display() {

		System.out.println("Name :" + name);
		System.out.println("Age :" + age);

	}

	public static void main(String[] args) {

		Q1 person1 = new Q1();
		person1.display();

		Q1 person2 = new Q1("John", 29);
		person2.display();
	}
}
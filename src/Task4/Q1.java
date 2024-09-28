package Task4;

class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

class NameNotValidException extends Exception {
	public NameNotValidException(String message) {
		super(message);
	}
}

class Student {
	private int rollNumber;
	private String name;
	private int age;
	private String course;

	public Student(int rollNumber, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
		}
		if (!isValidName(name)) {
			throw new NameNotValidException("Name contains numbers or special symbols.");
		}
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	private boolean isValidName(String name) {
		return name.matches("[a-zA-Z ]+");
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}
}

public class Q1 {
	public static void main(String[] args) {
		try {

			Student student1 = new Student(1, "John Doe", 20, "Computer Science");
			System.out.println("Student created: " + student1.getName());
			Student student2 = new Student(2, "Jane Smith", 22, "Electrical Engineering");
			Student student3 = new Student(3, "Alice123", 18, "Physics");
		} catch (AgeNotWithinRangeException e) {
			System.out.println("AgeNotWithinRangeException: " + e.getMessage());
		} catch (NameNotValidException e) {
			System.out.println("NameNotValidException: " + e.getMessage());
		}
	}
}

package Task4;

class Voter {
	private int voterId;
	private String name;
	private int age;

	public Voter(int voterId, String name, int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age for voter");
		}
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}

	public int getVoterId() {
		return voterId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Q2 {
	public static void main(String[] args) {
		try {

			Voter voter1 = new Voter(1, "Alice", 25);
			System.out.println("Voter created successfully: " + voter1.getName() + ", Age: " + voter1.getAge());

			Voter voter2 = new Voter(2, "Bob", 16); // This should throw InvalidAgeException
			System.out.println("Voter created successfully: " + voter2.getName() + ", Age: " + voter2.getAge());
		} catch (InvalidAgeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
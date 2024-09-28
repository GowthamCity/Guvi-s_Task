package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> students = new ArrayList<>();

		System.out.println("Enter Students name: ");
		// Getting the student names from the user
		for (int i = 0; i < 10; i++) {

			String name = scanner.nextLine();
			students.add(name);
		}
		scanner.close();
		// whose name starting in "a" is separated by using lambda expression and Stream
		// API.

		List<String> specialStudents = students.stream().filter(s -> s.startsWith("A") || s.startsWith("a"))
				.collect(Collectors.toList());

		System.out.println("Students who will receive special gifts: " + specialStudents);
	}
}
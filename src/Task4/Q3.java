package Task4;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the day position (0-6): ");
		int dayIndex = scanner.nextInt();

		try {
			String dayName = weekdays[dayIndex];
			System.out.println("The day at position " + dayIndex + " is: " + dayName);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Index out of bounds. Please enter a number between 0 and 6.");
		}
		scanner.close();

	}
}
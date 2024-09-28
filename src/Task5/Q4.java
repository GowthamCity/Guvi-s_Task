package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		// getting birth date form the user using scanner
		System.out.print("Enter your birthdate (yyyy-mm-dd): ");
		String input = obj.nextLine();

		LocalDate birthdate = LocalDate.parse(input);
		LocalDate currentDate = LocalDate.now();

		// calculating the difference between birth date and current date
		Period age = Period.between(birthdate, currentDate);

		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();

		obj.close();
		System.out.println("Your age is: " + years + " years " + months + " months " + days + " days");
	}
}
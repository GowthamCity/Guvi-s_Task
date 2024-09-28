package Task1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		// checking the given input is positive or negative with ifelse statement

		Scanner obj = new Scanner(System.in);
		System.out.println(" Provide the Input to check +ve or -ve ");
		int i = obj.nextInt();
		if (i >= 0) {

			System.out.println("The Given input is positive");
		} else {

			System.out.println("The Given input is negative");
		}

		obj.close();
	}

}
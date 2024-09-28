package Task1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// using if else statement

		Scanner obj = new Scanner(System.in);

		System.out.println(" Enter your Purchase Amount : ");

		double amount = obj.nextDouble(), dis;

		if (amount < 500) {
			// since the purchase is less than 500rs there is no discount
			System.out.println(" For this amount there is no discount");
			System.out.println(" The Final Purchase Amount : " + amount);
		} else if ((amount >= 500) && (amount <= 1000)) {

			// discounting 10% for the purchase from 500rs to 1000rs
			dis = ((10 * amount) / 100);

			System.out.println(" For Rs" + amount + " there is 10% discount which is Rs" + dis);
			System.out.println(" The Final Purchase Amount : " + (amount - dis));

		} else if (amount > 1000) {

			// discounting 10% for the purchase from 500rs to 1000rs
			dis = ((20 * amount) / 100);

			System.out.println(" For Rs" + amount + " there is 20% discount which is Rs" + dis);
			System.out.println(" The Final Purchase Amount : " + (amount - dis));

		} else {

			System.out.println(" Enter the correct amount ");
		}
		obj.close();
	}

}
package Task1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, a;
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the number to print sequences ");
		a = obj.nextInt();
		System.out.println("------------------------------------");
		for (i = a; i >= 1; i--) {

			for (j = a; j >= 1; j--) {

				if (j < i) {
					System.out.print(i + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		obj.close();
	}

}
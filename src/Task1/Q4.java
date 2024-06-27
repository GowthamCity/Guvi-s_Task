package Task1;

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// use to find the smallest number with if else statement
		
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println(" Enter three numbers to find the smallest number ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if((a<=b)&&(a<=c)) {
			
			System.out.println(" The smallest number is "+a);
		}else if((b<=a)&&(b<=c)) {
			
			System.out.println(" The smallest number is "+b);
		}else if((c<=a)&&(c<=b)) {
			
			System.out.println(" The smallest number is "+c);
		}else {
			
			System.out.println(" Enter the valid number ");
		}
		input.close();
	}

}
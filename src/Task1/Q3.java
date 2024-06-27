package Task1;


import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// to reverse the number order using for loop
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println(" Enter the value which need to be reversed ");
		
		String a = obj.next();
		int b = a.length();
		//char c;
		for(int j=(b-1);j>=0;j--) {
			 
			System.out.print(a.charAt(j));
		}
		obj.close();
	}

}
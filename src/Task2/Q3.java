package Task2;

public class Q3 {

	public double balance;

	// no Argument used
	public Q3() {

		balance = 0.0;
	}

	// Argument used
	public Q3(double startingBal) {

		balance = startingBal;
	}

	// for balance check i have used a method
	public void disBal() {

		System.out.println("Your Current Balance : Rs" + balance);
	}

	// for deposit amount i have used a method
	public void deposite(double amount) {

		balance += amount;
		System.out.println(amount + "Rs Deposited Successfully into your account");
	}

	// for withdrawal i have used a method
	public void withdraw(double amount) {

		balance -= amount;
		System.out.println(amount + "Rs is withdrawed form your account");
	}

	public static void main(String[] args) {

		System.out.println("===================================================");
		Q3 User1 = new Q3();
		User1.deposite(3000);
		User1.disBal();
		User1.withdraw(1500);
		User1.disBal();

		System.out.println("===================================================");
		Q3 User2 = new Q3(1500);

		User2.disBal();
		User2.deposite(1500);
		User2.disBal();
		User2.withdraw(1500);
		User2.disBal();

	}

}
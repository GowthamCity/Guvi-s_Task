package Task2;

import java.util.Scanner;

	class Product {
	    int pid;
	    double price;
	    int quantity;

	    
	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }
	}

	public class Q2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[5];

	        
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for product " + (i + 1) + ":");
	            System.out.print("PID: ");
	            int pid = scanner.nextInt();
	            System.out.print("Price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Quantity: ");
	            int quantity = scanner.nextInt();

	            products[i] = new Product(pid, price, quantity);
	        }

	        
	        int maxPriceIndex = 0;
	        double maxPrice = products[0].price;
	        for (int i = 1; i < products.length; i++) {
	            if (products[i].price > maxPrice) {
	                maxPrice = products[i].price;
	                maxPriceIndex = i;
	            }
	        }
	        System.out.println("PID of the product with the highest price: " + products[maxPriceIndex].pid);
	        
	        double totalAmountSpent = calculateTotalAmountSpent(products);
	        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
	        scanner.close();
	    }

	    public static double calculateTotalAmountSpent(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.price * product.quantity;
	        }
	        return totalAmount;
	    }
	    
	}
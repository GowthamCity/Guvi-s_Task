package Task3;

import java.util.Scanner;


interface Taxable {
 double SALES_TAX_RATE = 0.07;   
 double INCOME_TAX_RATE = 0.105; 

 void calcTax();  
}


class Employee implements Taxable {
 private int empId;
 private String name;
 private double salary;

 
 public Employee(int empId, String name, double salary) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
 }

 
 @Override
 public void calcTax() {
     double incomeTax = salary * INCOME_TAX_RATE;
     System.out.println("Income tax for employee " + name + " (ID: " + empId + ") is: $" + incomeTax);
 }
}


class Product implements Taxable {
 private int pid;
 private double price;
 private int quantity;

 
 public Product(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }

 
 @Override
 public void calcTax() {
     double salesTax = price * SALES_TAX_RATE * quantity;
     System.out.println("Sales tax for product (ID: " + pid + ") is: $" + salesTax);
 }
}


public class Q2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     System.out.println("Enter Employee details:");
     System.out.print("Employee ID: ");
     int empId = scanner.nextInt();
     scanner.nextLine();  // Consume newline
     System.out.print("Employee Name: ");
     String empName = scanner.nextLine();
     System.out.print("Employee Salary: ");
     double empSalary = scanner.nextDouble();
     Employee employee = new Employee(empId, empName, empSalary);

     
     System.out.println("\nEnter Product details:");
     System.out.print("Product ID: ");
     int pid = scanner.nextInt();
     System.out.print("Product Price per unit: ");
     double price = scanner.nextDouble();
     System.out.print("Product Quantity: ");
     int quantity = scanner.nextInt();
     Product product = new Product(pid, price, quantity);

     
     System.out.println("\nCalculating taxes...");
     employee.calcTax(); 
     product.calcTax();  

     scanner.close();
 }
}

package Task3;

import java.util.Scanner;


class Book {
 private int bookID;
 private String title;
 private String author;
 private boolean isAvailable;

 
 public Book(int bookID, String title, String author, boolean isAvailable) {
     this.bookID = bookID;
     this.title = title;
     this.author = author;
     this.isAvailable = isAvailable;
 }

 
 public int getBookID() {
     return bookID;
 }

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public boolean isAvailable() {
     return isAvailable;
 }

 
 public void setAvailable(boolean available) {
     isAvailable = available;
 }

 
 public void display() {
     System.out.println("Book ID: " + bookID);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
     System.out.println("----------------------------------");
 }
}


class Library {
 private Book[] books;  
 private int numBooks;  

 
 public Library(int capacity) {
     books = new Book[capacity];
     numBooks = 0;
 }

 
 public void addBook(Book book) {
     if (numBooks < books.length) {
         books[numBooks] = book;
         numBooks++;
         System.out.println("Book added successfully.");
     } else {
         System.out.println("Library is full. Cannot add more books.");
     }
 }

 
 public void removeBook(int bookID) {
     for (int i = 0; i < numBooks; i++) {
         if (books[i].getBookID() == bookID) {
             
             for (int j = i; j < numBooks - 1; j++) {
                 books[j] = books[j + 1];
             }
             numBooks--;
             System.out.println("Book removed successfully.");
             return;
         }
     }
     System.out.println("Book with ID " + bookID + " not found.");
 }

 
 public void searchBook(int bookID) {
     for (int i = 0; i < numBooks; i++) {
         if (books[i].getBookID() == bookID) {
             books[i].display();
             return;
         }
     }
     System.out.println("Book with ID " + bookID + " not found.");
 }

 
 public void displayBooks() {
     if (numBooks == 0) {
         System.out.println("Library is empty. No books to display.");
     } else {
         System.out.println("List of books in the library:");
         for (int i = 0; i < numBooks; i++) {
             books[i].display();
         }
     }
 }
}


public class Q1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Library library = new Library(10); 

     
     int choice;
     do {
         System.out.println("\nLibrary Management System Menu:");
         System.out.println("1. Add a new book");
         System.out.println("2. Remove a book");
         System.out.println("3. Search for a book by ID");
         System.out.println("4. Display all books");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline left-over

         switch (choice) {
             case 1:
                 System.out.print("Enter Book ID: ");
                 int bookID = scanner.nextInt();
                 scanner.nextLine(); 
                 System.out.print("Enter Title: ");
                 String title = scanner.nextLine();
                 System.out.print("Enter Author: ");
                 String author = scanner.nextLine();
                 Book newBook = new Book(bookID, title, author, true);
                 library.addBook(newBook);
                 break;
             case 2:
                 System.out.print("Enter Book ID to remove: ");
                 int removeID = scanner.nextInt();
                 library.removeBook(removeID);
                 break;
             case 3:
                 System.out.print("Enter Book ID to search: ");
                 int searchID = scanner.nextInt();
                 library.searchBook(searchID);
                 break;
             case 4:
                 library.displayBooks();
                 break;
             case 5:
                 System.out.println("Exiting Library Management System. Goodbye!");
                 break;
             default:
                 System.out.println("Invalid choice. Please enter a number between 1 and 5.");
         }
     } while (choice != 5);

     scanner.close();
 }
}

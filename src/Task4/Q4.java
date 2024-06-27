package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4 {
    private Map<String, Integer> studentGrades;

    public Q4() {
        this.studentGrades = new HashMap<>();
    }

    
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + " has been added with grade " + grade);
    }

    
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.remove(name);
            System.out.println(name + " has been removed with grade " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

   
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade is: " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q4 tracker = new Q4();

        
        tracker.addStudent("Alice", 85);
        tracker.addStudent("Bob", 90);
        tracker.addStudent("Charlie", 78);

       
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display a student's grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter student's grade: ");
                    int newGrade = scanner.nextInt();
                    tracker.addStudent(newName, newGrade);
                    break;
                case 2:
                    System.out.print("Enter student's name to remove: ");
                    String removeName = scanner.nextLine();
                    tracker.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student's name to display grade: ");
                    String displayName = scanner.nextLine();
                    tracker.displayGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
                    break;
            }
        }
    }
}
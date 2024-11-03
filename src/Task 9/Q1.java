package Task9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q1 {

    // JDBC URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/gowtham_s"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; 

    public static void main(String[] args) {
        // Data to be inserted
        Object[][] employees = {
            {101, "Jenny", 25, 10000},
            {102, "Jacky", 30, 20000},
            {103, "Joe", 20, 40000},
            {104, "John", 40, 80000},
            {105, "Shameer", 25, 90000}
        };

        String insertSQL = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            for (Object[] employee : employees) {
                preparedStatement.setInt(1, (Integer) employee[0]);   // empcode
                preparedStatement.setString(2, (String) employee[1]);  // empname
                preparedStatement.setInt(3, (Integer) employee[2]);    // empage
                preparedStatement.setInt(4, (Integer) employee[3]);    // esalary
                
                preparedStatement.executeUpdate(); // Execute the insert statement
            }
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
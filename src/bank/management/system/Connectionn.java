package bank.management.system;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectionn {
    public Connection c; // Declare Connection
    public Statement s; // Declare Statement

    public Connectionn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","Sushmita2k04");
            System.out.println("Database connected successfully!");
            s = c.createStatement();
            System.out.println("Statement created successfully!");

        } catch (Exception e){
            System.out.println("Error initializing connection or statement!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Connectionn conn = new Connectionn();
        if (conn.c != null && conn.s != null) {
            System.out.println("Connection and Statement initialized successfully!");
        } else {
            System.out.println("Failed to initialize connection or statement.");
        }
    }
}





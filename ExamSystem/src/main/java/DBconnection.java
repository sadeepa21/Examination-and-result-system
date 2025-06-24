
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class DBconnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/exam_db";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);
            {
                System.out.println("Connection successful!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed!");

        }
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }

}

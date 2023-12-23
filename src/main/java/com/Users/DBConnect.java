package com.Users;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static String url = "jdbc:mysql://localhost:3306/hospital";
    private static String userDB = "root";
    private static String passwordDB = "Charuka2001";
    private static Connection con;

    public static Connection getConnection() {
        

        try {
            Class.forName("com.mysql.jdbc.Driver");  // load the driver
            con = DriverManager.getConnection(url, userDB, passwordDB);
        } catch (Exception e) {
            System.out.println("Database connection is not success!!!");
        }

        return con;
    }
}

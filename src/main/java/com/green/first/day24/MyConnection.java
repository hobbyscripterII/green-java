package com.green.first.day24;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String USER = "root";
    private static final String PASSWORD = "green502";

    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            c = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}

package com.green.first.day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    // 자원을 안닫아주면 리소스를 많이 잡아먹는다.
    public static void close(Connection c, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (c != null) {
            try {
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection c, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        close(c, ps);
    }
}

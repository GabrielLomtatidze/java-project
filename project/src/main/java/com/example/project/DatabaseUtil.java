package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    private static final String URL =
            "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7812979?useSSL=false&serverTimezone=UTC";

    private static final String USER = "sql7812979";
    private static final String PASSWORD = "8YPnh8ah8G";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

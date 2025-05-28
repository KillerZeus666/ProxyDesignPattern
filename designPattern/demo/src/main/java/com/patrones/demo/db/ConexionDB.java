package com.patrones.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:postgresql://db.imjhsnipclosogfobpse.supabase.co:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "@zzyZeus*2006";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

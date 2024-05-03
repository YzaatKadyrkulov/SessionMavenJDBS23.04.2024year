package org.example.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConfig {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/topics",
                    "postgres",
                    "1234"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

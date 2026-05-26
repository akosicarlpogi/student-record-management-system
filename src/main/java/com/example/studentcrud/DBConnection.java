package com.example.studentcrud;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DBConnection {

    private DBConnection() {
    }

    public static Connection connect() {
        Properties props = loadProperties();

        String url = getConfig("STUDENT_DB_URL", props, "db.url", "jdbc:postgresql://localhost:5432/studentdb");
        String user = getConfig("STUDENT_DB_USER", props, "db.user", "postgres");
        String password = getConfig("STUDENT_DB_PASSWORD", props, "db.password", "your_password");

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Database connection failed. Check PostgreSQL, database name, username, and password.");
            e.printStackTrace();
            return null;
        }
    }

    private static Properties loadProperties() {
        Properties props = new Properties();

        try (InputStream input = DBConnection.class.getResourceAsStream("/db.properties")) {
            if (input != null) {
                props.load(input);
            }
        } catch (Exception e) {
            System.err.println("Could not read db.properties. Environment variables or default values will be used.");
        }

        return props;
    }

    private static String getConfig(String envName, Properties props, String propertyName, String defaultValue) {
        String envValue = System.getenv(envName);
        if (envValue != null && !envValue.isBlank()) {
            return envValue;
        }

        String propertyValue = props.getProperty(propertyName);
        if (propertyValue != null && !propertyValue.isBlank()) {
            return propertyValue;
        }

        return defaultValue;
    }
}

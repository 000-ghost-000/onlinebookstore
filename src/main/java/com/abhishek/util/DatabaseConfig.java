package com.bittercode.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class DatabaseConfig {

    static Properties prop = new Properties();

    static {
        try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new IOException("Database configuration file not found.");
            }
            prop.load(input);
        } catch (IOException e) {
            System.err.println("Failed to load database configuration: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public final static String DB_HOST = prop.getProperty("db.host");
    public final static String DB_PORT = prop.getProperty("db.port");
    public final static String DB_NAME = prop.getProperty("db.name");
    public final static String DB_USER_NAME = prop.getProperty("db.username");
    public final static String DB_PASSWORD = prop.getProperty("db.password");

    public final static String CONNECTION_STRING = DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?autoReconnect=true&useSSL=false";
}

package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String LOGIN = "root";
    private static final String PASS = "root";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            return connection = DriverManager.getConnection(URL, LOGIN, PASS);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

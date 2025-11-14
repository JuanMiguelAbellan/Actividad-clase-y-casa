package com.ClaseyCasa.Actividad.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConector {

    private static Connection connection;

    private DBConector(){}

    public Connection getInstance() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://peliculas.culzlq3uxgv6.us-east-1.rds.amazonaws.com:3306/actividad",
                        "admin", "admin.12345678");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}

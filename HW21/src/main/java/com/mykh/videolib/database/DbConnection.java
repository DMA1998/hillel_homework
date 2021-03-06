package com.mykh.videolib.database;

import com.mykh.videolib.utils.DbConfigs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection extends DbConfigs {

    public static Connection getConnection() throws SQLException {
        Connection result;
        String url = "jdbc:mysql://" + dbHost + dbPort + dbName + timeZone;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        result = DriverManager.getConnection(url, dbUserName, dbPassword);
        return result;
    }
}

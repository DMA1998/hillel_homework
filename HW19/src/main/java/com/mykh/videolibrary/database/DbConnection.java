package com.mykh.videolibrary.database;

import com.mykh.videolibrary.utils.DbConfigs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection extends DbConfigs {

    public static Connection getConnection() throws SQLException {
        Connection result;
        String url = "jdbc:mysql://" + dbHost + dbPort + dbName + timeZone;
        result = DriverManager.getConnection(url, dbUserName, dbPassword);
        return result;
    }
}

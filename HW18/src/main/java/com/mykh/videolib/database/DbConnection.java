package com.mykh.videolib.database;

import com.mykh.videolib.utils.Configs;

import java.sql.*;

public class DbConnection extends Configs {

    public Connection getDbConnection() throws ClassNotFoundException,SQLException {
        Connection dbConnection;
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + timeZone;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }
}

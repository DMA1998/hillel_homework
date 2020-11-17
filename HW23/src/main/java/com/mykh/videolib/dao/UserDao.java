package com.mykh.videolib.dao;

import static com.mykh.videolib.utils.QueryConstants.*;

import com.mykh.videolib.connection.ConnectionPool;
import com.mykh.videolib.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.mykh.videolib.utils.ColumnConstants.*;

public class UserDao {

    public boolean isAuthorized(User currentUser) {
        for (User user : users()) {
            if (user.getLogin().equals(currentUser.getLogin()) && user.getPassword() == currentUser.getPassword())
                return true;
        }
        return false;
    }


    public List<User> users() {
        List<User> result = new ArrayList<>();
        String sqlQuery = FIND_USERS_IN_DATABASE;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(sqlQuery);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = new User(resultSet.getString(USER_LOGIN), resultSet.getInt(USER_PASSWORD));
                result.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}





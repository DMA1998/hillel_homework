package com.mykh.videolib.dao;

import com.mykh.videolib.entities.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDao {

    public List<Film> findFilmByYear(int year, Connection connection) {

        String query = "SELECT * FROM films WHERE film_release = ?;";


        try (
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(year));
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Film film = new Film();
            System.out.println(resultSet);

            List<Film> films = new ArrayList<Film>();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

package com.mykh.videolib.library;

import com.mykh.videolib.database.DbConnection;
import com.mykh.videolib.entities.Producer;
import com.mykh.videolib.entities.Film;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.mykh.videolib.utils.Constants.*;

public class VideoLibrary {

    /**
     * • Найти все фильмы, вышедшие на экран в текущем и прошлом году.
     * • Вывести информацию об актерах, снимавшихся в заданном фильме.
     * • Вывести информацию об актерах, снимавшихся как минимум в N фильмах.
     * • * Вывести информацию об актерах, которые были режиссерами хотя бы одного из фильмов.
     * • Удалить все фильмы, дата выхода которых была более заданного числа лет назад.
     */

    DbConnection connection;

    public List<Film> findFilmsByYear() {
        List<Film> result = null;
        String sql = "SELECT * FROM video_library WHERE film_release >= 2019 ";
        try {
            try (Statement stmt = connection.getDbConnection().createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    System.out.println(
                            rs.getString(FILM_NAME) + "\t" +
                                    rs.getString(FILM_RELEASE));
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Producer> findActorBySingleFilm() {

        return null;
    }

    public List<Producer> findActorByMultipleFilms() {

        return null;
    }

    public List<Producer> findActorsAsProducers() {

        return null;
    }

    public List<Film> removeFilmsByYears() {


        return null;
    }
}








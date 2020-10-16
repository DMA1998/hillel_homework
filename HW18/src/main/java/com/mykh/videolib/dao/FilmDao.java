package com.mykh.videolib.dao;

import com.mykh.videolib.entities.Actor;
import com.mykh.videolib.entities.Film;
import com.mykh.videolib.entities.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.mykh.videolib.utils.Constants.*;
import static com.mykh.videolib.database.DbConnection.*;

public class FilmDao implements IFilmDao {

    @Override
    public List<Film> findFilmsByCurrentAndPreviousYear() {
        List<Film> result = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int previousYear = currentYear - 1;
        String sqlQuery = SEARCH_FILMS_BY_CURRENT_AND_PREVIOUS_YEAR;
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sqlQuery);
            stmt.setInt(1, previousYear);
            ResultSet resultSet = stmt.executeQuery();
            result = appendFilms(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsInParticularFilm(String film) {
        List<Actor> result = new ArrayList<>();
        String sqlQuery = SEARCH_ACTORS_BY_PARTICULAR_FILM;
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sqlQuery);
            stmt.setString(1, film);
            ResultSet resultSet = stmt.executeQuery();
            result = appendActors(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsByManyFilms(int filmsQuantity) {
        List<Actor> result = new ArrayList<>();
        String sqlQuery = SEARCH_ACTORS_BY_MANY_FILMS;
        try {
            PreparedStatement statement = getConnection().prepareStatement(sqlQuery);
            statement.setInt(1, filmsQuantity);
            ResultSet resultSet = statement.executeQuery();
            result = appendActors(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsLikeProducers() {
        List<Actor> result = new ArrayList<>();
        String sqlQuery = SEARCH_ACTORS_LIKE_PRODUCERS;
        try {
            PreparedStatement statement = getConnection().prepareStatement(sqlQuery);
            ResultSet resultSet = statement.executeQuery();
            result = appendActors(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void removeFilmsByYear(int year) {
        String sqlQuery = DELETE_FILM_BY_YEAR;
        try {
            PreparedStatement statement = getConnection().prepareStatement(sqlQuery);
            statement.setInt(1, year);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Actor> appendActors(ResultSet resultSet) throws SQLException {
        List<Actor> result = new ArrayList<>();
        while (resultSet.next()) {
            Actor actor = new Actor(resultSet.getString(1), resultSet.getString(2));
            result.add(actor);
        }
        return result;
    }

    private List<Film> appendFilms(ResultSet resultSet) throws SQLException {
        List<Film> result = new ArrayList<>();
        while (resultSet.next()) {
            Film film = new Film();
            String name = resultSet.getString(FILM_NAME);
            String filmRelease = resultSet.getString(FILM_RELEASE);
            String country = resultSet.getString(FILM_COUNTRY);

            film.setName(name);
            film.setFilmRelease(filmRelease);
            film.setCountry(country);

            result.add(film);
        }
        return result;
    }

    private List<Producer> appendProducers(ResultSet resultSet) throws SQLException {
        List<Producer> result = new ArrayList<>();
        while (resultSet.next()) {
            Producer producer = new Producer(resultSet.getString(1), resultSet.getString(2));
            result.add(producer);
        }
        return result;
    }
}

package com.mykh.videolib.utils;

public class Constants {

    public static final String SEARCH_FILMS_BY_CURRENT_AND_PREVIOUS_YEAR =
            "SELECT f.name,f.release,f.country " +
                    "FROM films f WHERE f.release >= ? ";

    public static final String SEARCH_ACTORS_BY_PARTICULAR_FILM =
            "SELECT a.name,a.birthday FROM films f" +
                    " INNER JOIN films_has_actors fha" +
                    " INNER JOIN actors a" +
                    " ON" +
                    " fha.films_id = f.id" +
                    " AND" +
                    " fha.actors_id = a.id" +
                    " where f.name LIKE ? ";

    public static final String SEARCH_ACTORS_BY_MANY_FILMS =
            "SELECT a.name,a.birthday FROM films f" +
                    " INNER JOIN films_has_actors fha" +
                    " INNER JOIN actors a" +
                    " ON" +
                    " fha.films_id = f.id" +
                    " AND" +
                    " fha.actors_id = a.id" +
                    " GROUP BY a.name" +
                    " HAVING COUNT(actors_id) > ? ";

    public static final String SEARCH_ACTORS_LIKE_PRODUCERS =
            "SELECT a.name,a.birthday FROM actors a " +
                    " INNER JOIN producers p " +
                    " ON a.name = p.name " +
                    " AND " +
                    " a.birthday = p.birthday ";

    public static final String DELETE_FILM_BY_YEAR =
                    " DELETE FROM films f " +
                    " WHERE f.release  > ? ";


    public static final String FILM_NAME = "name";
    public static final String FILM_COUNTRY = "country";
    public static final String FILM_RELEASE = "release";

}


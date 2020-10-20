package com.mykh.videolibrary.dbrunner;

import com.mykh.videolibrary.dao.FilmDao;

public class Runner {
    public static void main(String[] args) {
        FilmDao dao = new FilmDao();

        System.out.println(dao.findFilmsByCurrentAndPreviousYear());
     /*   dao.findActorsInParticularFilm("Gradle");
        dao.findActorsByManyFilms(2);
        dao.findActorsLikeProducers();
        dao.removeFilmsByYear(2017);*/
    }
}

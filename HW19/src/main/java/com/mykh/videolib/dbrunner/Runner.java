package com.mykh.videolib.dbrunner;

import com.mykh.videolib.dao.FilmDao;

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

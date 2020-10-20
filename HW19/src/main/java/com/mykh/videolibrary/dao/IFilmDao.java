package com.mykh.videolibrary.dao;

import com.mykh.videolibrary.entities.Actor;
import com.mykh.videolibrary.entities.Film;

import java.util.List;

public interface IFilmDao {

    List<Film> findFilmsByCurrentAndPreviousYear();

    List<Actor> findActorsInParticularFilm(String film);

    List<Actor> findActorsByManyFilms(int filmsQuantity);

    List<Actor> findActorsLikeProducers();

    void removeFilmsByYear(int year);


}

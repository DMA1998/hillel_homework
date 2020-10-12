package com.mykh.videolib.entities;

import java.util.List;
import java.util.Objects;

public class Film {
/*

    private Producer producer;
    private List<Actor> actors;
    Date productionDate;
*/



    private String name;
    private String filmRelease;
    private String country;
    private Producer producer;
    private List<Actor> actors;

    public Film() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilmRelease() {
        return filmRelease;
    }

    public void setFilmRelease(String filmRelease) {
        this.filmRelease = filmRelease;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", filmRelease='" + filmRelease + '\'' +
                ", country='" + country + '\'' +
                ", producer=" + producer +
                ", actors=" + actors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return name.equals(film.name) &&
                Objects.equals(filmRelease, film.filmRelease) &&
                Objects.equals(country, film.country) &&
                Objects.equals(producer, film.producer) &&
                Objects.equals(actors, film.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filmRelease, country, producer, actors);
    }
}

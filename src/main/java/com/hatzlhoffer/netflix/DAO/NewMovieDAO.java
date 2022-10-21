package com.hatzlhoffer.netflix.DAO;

import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hatzlhoffer.netflix.models.Genre;
import com.hatzlhoffer.netflix.models.Movie;

public class NewMovieDAO {
    private String name;
    private String director;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate lastDayToWatch;

    private ArrayList<Genre> genres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getLastDayToWatch() {
        return lastDayToWatch;
    }

    public void setLastDayToWatch(LocalDate lastDayToWatch) {
        this.lastDayToWatch = lastDayToWatch;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public Movie returnMovie() {
        Movie movie = new Movie();
        movie.setDirector(this.director);
        movie.setReleaseDate(this.releaseDate);
        // movie.setGenres(this.genres);
        movie.setLastDaytoWatch(this.lastDayToWatch);
        movie.setName(this.name);
        return movie;
    }
}

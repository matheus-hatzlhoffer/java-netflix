package com.hatzlhoffer.netflix.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Movie {
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;

    private String director;

    public Movie(String name, LocalDate releaseDate, String director) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}

package com.hatzlhoffer.netflix.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hatzlhoffer.netflix.DAO.NewMovieDAO;
import com.hatzlhoffer.netflix.models.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/movie")
public class MoviesController {
    private List<Movie> movies = new ArrayList<>();

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> GetAllMovies() {
        return ResponseEntity.ok().body(movies);
    }

    @PostMapping(value = "/create")
    public NewMovieDAO postMethodName(@RequestBody com.hatzlhoffer.netflix.DAO.NewMovieDAO entity) {
        Movie movie = new Movie(entity.getName(), entity.getDate(), entity.getName());
        movies.add(movie);
        return entity;
    }

}

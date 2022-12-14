package com.hatzlhoffer.netflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hatzlhoffer.netflix.DAO.NewMovieDAO;
import com.hatzlhoffer.netflix.models.Movie;
import com.hatzlhoffer.netflix.repositories.MovieRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/movie")
public class MoviesController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Movie>> GetAllMovies() {
        return ResponseEntity.ok().body(movieRepository.findAll());
    }

    @PostMapping(value = "/create")
    public NewMovieDAO addMovie(@RequestBody NewMovieDAO entity) {
        // TODO - check if there is a generic way of doing this
        Movie newMovie =  entity.returnMovie();
        movieRepository.save(newMovie);
        return entity;
    }
}

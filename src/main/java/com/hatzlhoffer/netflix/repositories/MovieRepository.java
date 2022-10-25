package com.hatzlhoffer.netflix.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hatzlhoffer.netflix.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{
}

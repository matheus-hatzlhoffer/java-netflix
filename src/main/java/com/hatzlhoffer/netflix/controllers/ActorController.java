package com.hatzlhoffer.netflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hatzlhoffer.netflix.DAO.NewActorDAO;
import com.hatzlhoffer.netflix.models.Actor;
import com.hatzlhoffer.netflix.repositories.ActorRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/actor")
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Actor>> GetAllMovies() {
        return ResponseEntity.ok().body(actorRepository.findAll());
    }

    @PostMapping(value = "/create")
    public NewActorDAO addMovie(@RequestBody NewActorDAO entity) {
        // TODO - check if there is a generic way of doing this
        Actor newActor = entity.returnActor();
        actorRepository.save(newActor);
        return entity;
    }
}

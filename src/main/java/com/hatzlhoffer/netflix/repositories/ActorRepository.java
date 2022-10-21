package com.hatzlhoffer.netflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hatzlhoffer.netflix.models.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}

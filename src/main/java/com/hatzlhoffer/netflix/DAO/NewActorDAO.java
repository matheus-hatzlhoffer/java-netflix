package com.hatzlhoffer.netflix.DAO;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hatzlhoffer.netflix.models.Actor;

public class NewActorDAO {

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate bornDate;

    public Actor returnActor() {
        Actor newActor = new Actor();
        newActor.setName(this.name);
        newActor.setBornDate(this.bornDate);
        return newActor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

}

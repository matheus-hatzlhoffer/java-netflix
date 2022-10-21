package com.hatzlhoffer.netflix.models;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String director;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "release_date")
    private LocalDate releaseDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "last_day_to_watch")
    private LocalDate lastDaytoWatch;

    // TODO - Add many to Many Relation with Actors and Genre
    // @ManyToMany(cascade = CascadeType.ALL)
    // @JoinTable(name="movie_actors",
    // joinColumns={@JoinColumn(name="movie_id")},
    // inverseJoinColumns={@JoinColumn(name="actor_id")})
    // private ArrayList<Actor> actors;

    // @ManyToMany(targetEntity = Genre.class)
    // ArrayList<Genre> genres;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date", nullable = false)
    private LocalDate modifyDate;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // public ArrayList<Genre> getGenres() {
    // return genres;
    // }

    // public void setGenres(ArrayList<Genre> genres) {
    // this.genres = genres;
    // }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLastDaytoWatch() {
        return lastDaytoWatch;
    }

    public void setLastDaytoWatch(LocalDate lastDaytoWatch) {
        this.lastDaytoWatch = lastDaytoWatch;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }
}

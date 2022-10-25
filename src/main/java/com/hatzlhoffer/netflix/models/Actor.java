package com.hatzlhoffer.netflix.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "born_date")
    private LocalDate bornDate;

    // TODO - Add many to Many Relation with movies
    // @ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL, fetch =
    // FetchType.LAZY)
    // private ArrayList<Movie> movies;

    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;

    @UpdateTimestamp
    @Column(name = "modify_date", nullable = false)
    private LocalDate modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

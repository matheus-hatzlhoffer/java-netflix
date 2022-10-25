package com.hatzlhoffer.netflix.models;

public enum Genre {
    ACTION("ACTION"), DRAMA("DRAMA"), COMEDY("COMEDY"), ANIMATION("ANIMATION");

    private String genre;

    private Genre(String genre) {
        this.genre = genre;
    }

    public String getCode() {
        return genre;
    }
}

package com.example.movie.model;

public class Movie {
    private int movieId;
    private String movieName;
    private String leadActor;

    public Movie(int movieId, String movieName, String leadActor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieName(int movieName) {
        this.movieName = movieName;
    }

    public int getMovieName() {
        return movieName;
    }

    public void setLeadActor(int leadActor) {
        this.leadActor = leadActor;
    }

    public int getLeadActor() {
        return leadActor;
    }
}

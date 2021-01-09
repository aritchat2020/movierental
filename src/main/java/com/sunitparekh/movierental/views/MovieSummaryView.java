package com.sunitparekh.movierental.views;

import com.sunitparekh.movierental.models.MovieRdbms;

import java.time.format.DateTimeFormatter;

public class MovieSummaryView {
    private MovieRdbms movie;
    public MovieSummaryView(MovieRdbms movie){
        this.movie = movie;
    }

    public String getName(){
        return movie.getName();
    }

    public String getReleaseDate(){
        return movie.getReleaseDate().format(DateTimeFormatter.ISO_DATE);
    }

    public Long getId(){
        return movie.getId();
    }
}

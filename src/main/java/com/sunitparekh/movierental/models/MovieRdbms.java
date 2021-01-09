package com.sunitparekh.movierental.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="MOVIES")
public class MovieRdbms {
    @Id
    @Column(name="MOVIE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="MOVIE_NAME")
    private String name;

    @Column(name="RELEASE_DATE", columnDefinition = "DATE")
    private Timestamp releaseDate;

    public MovieRdbms(){

    }

    public MovieRdbms(String name, Timestamp releaseDate){
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName(){
        return name;
    }

    public Timestamp getReleaseDate(){
        return releaseDate;
    }

    public Long getId(){
        return id;
    }
}

package com.sunitparekh.movierental.controllers;

import com.sunitparekh.movierental.models.MovieRdbms;
import com.sunitparekh.movierental.repositories.MovieRepository;
import com.sunitparekh.movierental.views.MovieSummaryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {
    //Read from application.properties file
    @Value("${last.name}")
    private String lastName;

    @Autowired
    MovieRepository repository;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Sunit!!!" + lastName;
    }

    @GetMapping("/movies")
    public List<MovieSummaryView> movieList(){
        return ((List<MovieRdbms>) repository.findAll()).stream().map(MovieSummaryView::new).collect(Collectors.toList());
    }
}

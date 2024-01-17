package com.rl5.apimovies.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MoviesController {
    
    @GetMapping("/movies")
    public String getMovies(@RequestParam String param) {
        return "g";
    }
    
}

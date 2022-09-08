package com.aylincelik.dockernetworking.films.controller;

import com.aylincelik.dockernetworking.films.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping("/api/films")
    public ResponseEntity<String> GetFilms(){

        String serviceResult = service.GetFilms();

        if(serviceResult == null || serviceResult.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.OK).body(serviceResult);
    }

    @GetMapping("/api/favFilms")
    public ResponseEntity<String> MyFavoriteFilms(){

        String serviceResult = service.MyFavoriteFilms();

        if(serviceResult == null || serviceResult.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.OK).body(serviceResult);
    }
}

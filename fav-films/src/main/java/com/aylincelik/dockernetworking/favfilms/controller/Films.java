package com.aylincelik.dockernetworking.favfilms.controller;

import com.aylincelik.dockernetworking.favfilms.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class Films {

    @Autowired
    private FilmService service;

    @GetMapping("api/favFilms")
    public ResponseEntity<String> GetFilms(){

        String serviceResult = service.GetMyFavFilms();

        if(serviceResult == null || serviceResult.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.OK).body(serviceResult);
    }

}

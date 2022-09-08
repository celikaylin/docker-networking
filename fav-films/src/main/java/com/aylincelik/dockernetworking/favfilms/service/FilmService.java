package com.aylincelik.dockernetworking.favfilms.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    public String GetMyFavFilms(){

        List<String> films = new ArrayList<String>();
        films.add("Lord of The Rings");
        films.add("The Pursuit of Happiness");
        films.add("Forest Gump");
        films.add("Interstellar");

        String json = new Gson().toJson(films);

        return json;
    }
}

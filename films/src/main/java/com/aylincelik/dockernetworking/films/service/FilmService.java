package com.aylincelik.dockernetworking.films.service;

import com.aylincelik.dockernetworking.films.model.ExternalApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FilmService {

    @Autowired
    private ExternalApiConfig config;

    public String GetFilms(){
        String requestUrl = config.getSwUrl() + "/films";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(requestUrl, String.class);

        return result;
    }

    public String MyFavoriteFilms(){
        String requestUrl = config.getFavUrl() + "/favFilms";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(requestUrl, String.class);

        return result;
    }
}

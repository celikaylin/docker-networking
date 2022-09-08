package com.aylincelik.dockernetworking.films.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("external-service")
public class ExternalApiConfig {

    private String swUrl;

    private String favUrl;

    public ExternalApiConfig() {
    }

    public ExternalApiConfig(String swUrl, String favUrl) {
        this.swUrl = swUrl;
        this.favUrl = favUrl;
    }

    public String getSwUrl() {
        return swUrl;
    }

    public void setSwUrl(String swUrl) {
        this.swUrl = swUrl;
    }

    public String getFavUrl() {
        return favUrl;
    }

    public void setFavUrl(String favUrl) {
        this.favUrl = favUrl;
    }
}

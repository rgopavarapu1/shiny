package com.api.cucumberRestAssured.resources;

public enum apiPath {
    AddPlaceAPI("/maps/api/place/add/json"),
    GetPlaceAPI("/maps/api/place/get/json"),
    DeletePlaceAPI("/maps/api/place/delete/json");

    private String path;

    apiPath(String path) {
        this.path = path;
    }

    public String getapiPath() {
        return path;
    }
}

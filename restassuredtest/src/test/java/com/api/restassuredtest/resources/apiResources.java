package com.api.restassuredtest.resources;

public enum apiResources {
    products("/products");
    private String resource;

    apiResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

}

package com.api.restassuredtest.resources;

public enum apiResources {
    PRODUCTS("/products");
    private String resource;

    apiResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

}

package com.api.restassuredtest.pojo;

public class Services {
    private String id;
    private String name;
    private String createdAt;
    private String updatedAt;
    private StoreServices storeservices;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    public StoreServices getStoreservices() {
        return storeservices;
    }
    public void setStoreservices(StoreServices storeservices) {
        this.storeservices = storeservices;
    }
}

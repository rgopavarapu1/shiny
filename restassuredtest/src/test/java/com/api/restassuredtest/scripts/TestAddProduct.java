package com.api.restassuredtest.scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.restassuredtest.resources.addProductPayload;
import com.api.restassuredtest.resources.utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestAddProduct extends utils{

    RequestSpecification baseRequest;
    ResponseSpecification res;
    Response apiresult;
    List<String> arr = new ArrayList<>();

    addProductPayload payload = new addProductPayload();


    @Test(dataProvider = "ProductDetails", enabled = false)
    public void addnewProduct(String name, String type, long price, long shipping, String upc, String description, String manufacturer, String model, String website, String image) throws IOException{
        baseRequest = given().spec(baseRequestSpecification()).body(addProductPayload.AddNewProduct(name, type, price, shipping, upc, description, manufacturer, model, website, image));

        res = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
        apiresult = baseRequest.when().post("/products").then().spec(res).extract().response();
        System.out.println(apiresult.asPrettyString());
        arr.add(apiresult.jsonPath().getString("id"));

        System.out.println(arr);
        // arr.appened(apiresult.jsonPath().getString("id"));
        Assert.assertEquals(getJsonPathUri(apiresult, "name"), name);
        
    }
    

    @DataProvider(name= "ProductDetails")
    public Object[][] getData() {

        return new Object[][] {
            {"Airpods", "earphones",0,0, "ER34DER", "Earpiece to attend calls, listen music", "BOAT", "793nd9304", "www", "wwwom", "image"},
            {"Fire TV","Streaming device", 19, 0, "CDPE958", "Streaming device to view content", "Amazon", "74MFOENC", "wwwcomfireTV", "wwwamazoncom", "image2"}
        };

    }

}

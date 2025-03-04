package com.api.restassuredtest.scripts;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import org.testng.annotations.Test;

import com.api.restassuredtest.pojo.Addproduct;
import com.api.restassuredtest.resources.utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestAddproductPojo extends utils{

    RequestSpecification baseRequest;
    ResponseSpecification res;
    Response apiresult;

    @Test
    public void addNewProduct() throws IOException {

        Addproduct pj = new Addproduct();
        pj.setName("Dash Cam");
        pj.setType("Camera");
        pj.setPrice(199.99);
        pj.setShipping(0);
        pj.setUpc("WMUXPEC");
        pj.setDescription("Product used as security to cameras as an evidence during accidents");
        pj.setManufacturer("Dash");
        pj.setModel("HGEX89C792");
        pj.setUrl("/dashcam/dualcam");
        // pj.setWebsite("http://www.cam.com");
        pj.setImage("Are we really loading image as string?");

        baseRequest = given().spec(baseRequestSpecification()).body(pj);

        res = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
        apiresult = baseRequest.when().post("/products").then().spec(res).extract().response();
        
        System.out.println(apiresult.asPrettyString());
    }

}

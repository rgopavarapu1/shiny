package com.api.restassuredtest.scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.restassuredtest.resources.utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestDeleteStore extends utils {

	RequestSpecification baseRequestSpec;
	ResponseSpecification respSpec;
	Response apiResponse;
	static String store_id = "1536";


	@Test
	public void deleteStoreInfo() throws IOException {
		baseRequestSpec = given().spec(baseRequestSpecification());
		
		respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		apiResponse = baseRequestSpec.when().delete("stores/" + store_id).then().spec(respSpec).extract().response();
		System.out.println(apiResponse);
	}

}


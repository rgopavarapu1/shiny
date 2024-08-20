package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.jsonData;
import resources.utils;

public class addStore extends utils {

    Response createStoreResponse, getStoreinfo;
    ResponseSpecification responseBuilder;
    RequestSpecification request;
    ResponseSpecification resp;
    static String storeID;


    jsonData jd = new jsonData();

    @Given("create a new store using {string}, {string}, {string}, {string}")
    public void create_a_new_store_using(String name, String city, String state, String zipcode) throws IOException {
        request = given().spec(baseRequest()).body(jd.addStorePayload(name, city, state, zipcode));
    }

    @When("user calls Store API with {string} HTTP request")
    public void user_calls_store_api_with_http_request(String method) {
        // Write code here that turns the phrase above into concrete actions
        // responseBuilder = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if(method.equalsIgnoreCase("POST"))
            createStoreResponse = request.when().post("/stores").then().spec(baseResponse()).extract().response();
        else if(method.equalsIgnoreCase("GET"))
            getStoreinfo = request.when().get("/stores/{store_id}").then().spec(baseResponse()).extract().response();
            
    }

    @Then("API call completed successfully with {int} response")
    public void api_call_completed_successfully_with_response(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(createStoreResponse.statusCode(), 201);
        
    }

    @Then("name in response is {string}")
    public void name_in_response_is(String expectedName) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String storeID = getJsonPathUri(createStoreResponse, "id");
        System.out.println(storeID);
        request = given().spec(baseRequest()).pathParam("store_id", storeID);
        // getStoreinfo = request.when().get("/stores/{store_id}").then().spec(baseResponse()).extract().response();
        user_calls_store_api_with_http_request("GET");
        String actualName = getJsonPathUri(createStoreResponse, "name");
        System.out.println("expected: " + expectedName + "\t Actual: " + actualName + "\n");

        assertEquals(expectedName, actualName);

    }

}

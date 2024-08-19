package com.api.cucumberRestAssured.resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.io.File;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {

    public static RequestSpecification baseReq;
    public static Properties prop;
    public static FileInputStream fis;
    static String propFilePath = new File("/src/test/java/com/api/cucumberRestAssured/properties/global.properties")
            .getAbsolutePath();

    public RequestSpecification baseRequestSpecification() throws IOException {
        if (baseReq == null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.log"));
            baseReq = new RequestSpecBuilder().setBaseUri(getPropValues("baseUrl"))
                    .addQueryParam("key", getPropValues("apiKey"))
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
            return baseReq;
        }
        return baseReq;
    }

    // public static String getUri(String endPoint) throws IOException {
    //     prop = new Properties();
    //     fis = new FileInputStream(propFilePath);
    //     prop.load(fis);
    //     return prop.getProperty(endPoint);
    // }

    // public static String getApiKey(String keyValue) throws IOException {
    //     prop = new Properties();
    //     fis = new FileInputStream(propFilePath);
    //     prop.load(fis);
    //     return prop.getProperty(keyValue);
    // }

    public static String getPropValues(String getValue) throws IOException {
        prop = new Properties();
        fis = new FileInputStream(propFilePath);
        prop.load(fis);
        return prop.getProperty(getValue);
    }

    public String getJsonPathUri(Response response1, String keyValue) {
        String resp = response1.asString();
        JsonPath js = new JsonPath(resp);
        return js.get(keyValue).toString();
    }

}

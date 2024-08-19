package com.api.restassuredtest.resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {
    public static Properties prop;
    public static RequestSpecification baseReq;
    public static FileInputStream fis;
    // TODO: use conditional operator to get endpoint based on environment
    
    public RequestSpecification baseRequestSpecification() throws IOException {
        if(baseReq == null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.log"));
            baseReq = new RequestSpecBuilder().setBaseUri(getEndPoint("endpoint"))
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .setContentType(ContentType.JSON).build(); 
                return baseReq;
        }
        return baseReq; 
    }
    
    public static String getEndPoint(String endpointUrl) throws IOException {
        prop = new Properties();
        fis = new FileInputStream("src\\test\\java\\com\\api\\restassuredtest\\resources\\global.properties");
        prop.load(fis);
        return prop.getProperty(endpointUrl);
    }

        public String getJsonPathUri(Response response, String keyValue) {
        String resp=response.asString();
        JsonPath js = new JsonPath(resp);
        return js.get(keyValue).toString();
    }

}

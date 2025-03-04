package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class utils {

    RequestSpecification baseReq;
    ResponseSpecification baseResp;
    static Properties prop;
    static FileInputStream fis;

    public RequestSpecification baseRequest() throws IOException {
        if (baseReq == null) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
            LocalDateTime now = LocalDateTime.now();
            String filename = "logging-" + dtf.format(now) + ".log";

            PrintStream log = new PrintStream(new FileOutputStream(filename, true));
            baseReq = new RequestSpecBuilder().setBaseUri(getEndPoint("endpoint"))
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
            return baseReq;
        }
        return baseReq;
    }

    public ResponseSpecification baseResponse() {
        return baseResp = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
    }

    public static String getEndPoint(String endpointUrl) throws IOException {
        // String filepath = new
        // File("src\test\java\com\api\\restassuredtest\\resources\\global.properties")
        prop = new Properties();

        fis = new FileInputStream("src\\test\\java\\resources\\global.properties");
        prop.load(fis);
        return prop.getProperty(endpointUrl);
    }

    public String getJsonPathUri(Response response, String keyValue) {
        String resp = response.asString();
        JsonPath js = new JsonPath(resp);
        return js.get(keyValue).toString();
    }

}

package com.api.restassuredtest.scripts;

import static io.restassured.RestAssured.given;
import java.util.List;

import org.testng.annotations.Test;

import com.api.restassuredtest.pojo.Services;
import com.api.restassuredtest.pojo.StoreInfo;

public class TestGetStore {

    @Test
    public void getStoreInfo() {
        StoreInfo response = given().log().all()
        .when().log().all().get("http://localhost:3030/stores/8").as(StoreInfo.class);

        System.out.println("\ncity: "+ response.getCity());
        
        System.out.println(response.getId());
        System.out.println("\n****\n"+response.getServices().size());
        // List<Services> storeServiceJson = response.getServices();

        List<Services> servicesJson = response.getServices();
        for(int i=0; i<servicesJson.size(); i++) {
            if(servicesJson.get(i).getName().equalsIgnoreCase("Geek Squad Services")) {
                System.out.println(servicesJson.get(i).getId());
                break;
            }
        }

        // // Validate Service name to "Geek Squad Services"
        for(int i=0; i<servicesJson.size(); i++) {
            String servicename = servicesJson.get(i).getName();
            System.out.println(servicename);
            // assertEquals("Geek Squad Services", servicename);
            if("Geek Squad Services".equals(servicename)) {
                System.out.println(servicesJson.get(i).getId());
                break;
            }

        }
    }
}

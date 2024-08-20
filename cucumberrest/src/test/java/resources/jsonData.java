package resources;

// import pojo.Services;
import pojo.addStore;

public class jsonData {

    public addStore addStorePayload(String name, String city, String state, String zipcode) {
        addStore storeData = new addStore();
        storeData.setName(name);
        storeData.setType("electronics store");
        storeData.setAddress("Book store");
        storeData.setAddress2("book store @ uni");
        storeData.setCity(city);
        storeData.setState(state);
        storeData.setZip(zipcode);
        storeData.setLat(0);
        storeData.setLng(0);
        storeData.setHours(zipcode);

        // Services s = new Services();
        // s.setCreatedAt("293");
        // s.setServiceId(43);
        // s.setStoreId(8944);
        // s.setUpdatedAt("234");

        // storeData.setServices(s);

        
        return storeData;
    }

}

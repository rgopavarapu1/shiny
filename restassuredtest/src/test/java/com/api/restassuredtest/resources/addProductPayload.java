package com.api.restassuredtest.resources;

public class addProductPayload {

    public static String AddNewProduct(String name, String type, long price, long shipping, String upc, String description, String manufacturer, String model, String url, String website, String image) {
        String addProductJson = "{\r\n"
        		+ "  \"name\": \""+name+"\",\r\n"
        		+ "  \"type\": \""+type+"\",\r\n"
        		+ "  \"price\": "+price+",\r\n"
        		+ "  \"shipping\": "+shipping+",\r\n"
        		+ "  \"upc\": \""+upc+"\",\r\n"
        		+ "  \"description\": \""+description+"\",\r\n"
        		+ "  \"manufacturer\": \""+manufacturer+"\",\r\n"
        		+ "  \"model\": \""+model+"\",\r\n"
        		+ "  \"url\": \""+website+"\",\r\n"
        		+ "  \"image\": \""+image+"\"\r\n"
        		+ "}";
        return addProductJson;
    }
}

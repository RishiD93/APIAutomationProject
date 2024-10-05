package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateTests extends BaseTest {

    @Test
    public void TestUpdatePost() {
        // Create request body for PUT request (updating an existing post)
        String requestBody = "{\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"updated title\",\n" +
                "  \"body\": \"updated body\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send PUT request and capture response
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/posts/1");

        // Validate response status code (should be 200 for successful update)
        Assert.assertEquals(response.getStatusCode(), 200);

        // Validate the title has been updated
        String updatedTitle = response.jsonPath().getString("title");
        Assert.assertEquals(updatedTitle, "updated title");

        // Optionally, print the response body
        System.out.println("Updated Post Response: " + response.getBody().asString());
    }
}
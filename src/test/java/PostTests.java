package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostTests extends BaseTest {

    @Test
    public void TestCreatePost() {
        // Create request body for POST request
        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";

        // Send POST request and capture response
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts");

        // Validate response status code (should be 201 for resource creation)
        Assert.assertEquals(response.getStatusCode(), 201);

        // Validate the response contains a non-null ID
        int id = response.jsonPath().getInt("id");
        Assert.assertNotNull(id);

        // Optionally, print the response body
        System.out.println("Created Post ID: " + id);
    }
}
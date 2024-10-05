package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteTests extends BaseTest {

    @Test
    public void TestDeletePost() {
        // Send DELETE request to remove post with ID 1
        Response response = RestAssured
                .given()
                .when()
                .delete("/posts/1");

        // Validate response status code (should be 200 for successful deletion)
        Assert.assertEquals(response.getStatusCode(), 200);

        // Optionally, print the response body (should be empty for successful deletion)
        System.out.println("Delete Response: " + response.getBody().asString());
    }
}
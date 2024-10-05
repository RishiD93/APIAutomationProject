package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {
    @Test
    public void TestGetuser(){
        Response response = RestAssured
                .given()
                .when()
                .get("/users/1");
        // Validate response status code
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}

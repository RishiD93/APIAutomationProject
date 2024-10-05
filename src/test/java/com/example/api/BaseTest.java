package com.example.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        // Set the base URI for the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
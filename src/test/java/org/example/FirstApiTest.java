package org.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstApiTest {

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void checkUserEndpoint() {
        given()
            .log().all()
        .when()
            .get("/users/1")
        .then()
            .log().all()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("username", equalTo("Bret"));
    }
    @Test
    void checkUserNotFound() {
        given()
        .when()
            .get("/users/999")
        .then()
            .statusCode(404);
    }
}
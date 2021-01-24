package br.com.petz.apis;

import br.com.petz.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Api {
    private final String apiKeyHeader = "api_0015_152019ab2";
    private final String baseUri = "https://petstore.swagger.io/v2";
    Helper helper = new Helper();

    public Api() {
    }

    public Response getPetById(int id) {
        getRequest();
        return RestAssured.given()
                .log().all()
                .basePath("/pet/" + id)
                .when().relaxedHTTPSValidation().get();

    }


    public Response addNewPet(Pet pet) {
        try {

            request();

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(pet);
            return RestAssured.given()
                    .log().all()
                    .basePath("/pet")
                    .body(json)
                    .when().relaxedHTTPSValidation().post();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Response addNewUser(User user) {
        try {
            List<User> users = new ArrayList<>();
            users.add(user);
            var json = generateJson(users);
            request();

            return RestAssured.given()
                    .log().all()
                    .basePath("/user/createWithArray")
                    .body(json)
                    .when().relaxedHTTPSValidation().post();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void getRequest() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .addHeader("api_key", apiKeyHeader).build();
    }

    public void request() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setContentType(ContentType.JSON)
                .addHeader("api_key", apiKeyHeader).build();


    }

    public String generateJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(obj);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public Response getUserByUserName(String username) {
        getRequest();
        return RestAssured.given()
                .log().all()
                .basePath("/user/" + username)
                .when().relaxedHTTPSValidation().get();
    }
    public Response addNewOrder(Order order) {
        try {
            var json = generateJson(order);
            request();

            return RestAssured.given()
                    .log().all()
                    .basePath("/store/order")
                    .body(json)
                    .when().relaxedHTTPSValidation().post();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    public Response updateOrder(Order order) {
        try {
            var json = generateJson(order);
            request();

            return RestAssured.given()
                    .log().all()
                    .basePath("/store/order")
                    .body(json)
                    .when().relaxedHTTPSValidation().post();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
package br.com.petz.apis;

import br.com.petz.model.Category;
import br.com.petz.model.Pet;
import br.com.petz.model.Tag;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.core.internal.gherkin.deps.com.google.gson.internal.$Gson$Types;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.openqa.selenium.json.Json;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PetzWebService {
    private URL url;

    public PetzWebService(String service) {
        try {
            this.url = new URL("https://petstore.swagger.io/v2" + service
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Response sendGetRequest() {
//        var headers = RestAssured.given().header()
        var res = RestAssured.given().relaxedHTTPSValidation().get(url);
        return res;
    }

    public Response sendPostRequest() {
        var pet = new Pet();
        var category = new Category(10, "Puddle");
        var tag = new Tag(10, "Leona");
        List<String> photoUrls = new ArrayList<>();
        List<Tag> tags = new ArrayList<>();
        tags.add(tag);
        photoUrls.add("https://exxamples.org/photo/pet/dog");
        photoUrls.add("https://exxamples.org/photo/pet/dog");
        pet.setId(10);
        pet.setName("Leona");
        pet.setPhotourls(photoUrls);
        pet.setCategory(category);
        pet.setTags(tags);
        pet.setStatus("AVAILABLE");
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io")
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "api_0015_152019ab2").build();

        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(pet);
            return RestAssured.given()
                    .log().all()
                    .basePath("/v2/pet")
                    .body(json)
                    .when().relaxedHTTPSValidation().post();
        } catch (Exception e) {
            e.printStackTrace();
        }

    return null;
    }


}


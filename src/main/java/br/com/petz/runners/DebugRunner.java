package br.com.petz.runners;

import br.com.petz.apis.PetzWebService;
import br.com.petz.model.Pet;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.path.xml.XmlPath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

public class DebugRunner {
    @Test
    public void testApi() {
        var petz = new PetzWebService("/pet/10");
        var res = petz.sendGetRequest();
        Assert.assertEquals(res.statusCode(), 200);
        System.out.println(res.asString());
        var stringResponse = res.asString();
        var jsonPath = res.jsonPath();

        //        var xmlPath = new XmlPath(stringResponse);
        var name = jsonPath.get("category.name");
        System.out.println(name);
    }

    @Test
    public void testPostRequest(){
        PetzWebService petz = new PetzWebService("/pet");
        var rest = petz.sendPostRequest();
        Assert.assertEquals(200, rest.statusCode());
    }

}

package br.com.petz.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"src/main/resources/features"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        glue = {"classpath:br.com.petz.steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true, tags = {""})
public class ApiRunner {

}

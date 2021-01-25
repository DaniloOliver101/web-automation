package br.com.submarino.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"classpath:features"},
        plugin = {"pretty", "json:target/cucumber-web-reports/cucumber.json"},
        glue = {"classpath:br.com.submarino.steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true,
        tags = {"@WEB"})
public class WebRunner {

}
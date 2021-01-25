package br.com.submarino.driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element {
    private WebDriver driver;

    public WebElement findElementByName(String name) {
        return driver.findElement(By.name(name));
    }

    public WebElement findElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findElementByLinkText(String text) {
        return driver.findElement(By.linkText(text));
    }

    public WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void get(String url){
        driver.get(url);
    }

}

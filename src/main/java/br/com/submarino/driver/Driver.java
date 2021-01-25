package br.com.submarino.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    protected final WebDriver driver;

    public Driver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public Driver(String str){
        this.driver = null;}

    public void get(String url) {
        driver.get(url);
    }


    public void sleep(long seconds) {
        try {
            driver.wait(seconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }

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


    public WebElement findElementByClassName(String className) {
        return driver.findElement(By.className(className));
    }
}
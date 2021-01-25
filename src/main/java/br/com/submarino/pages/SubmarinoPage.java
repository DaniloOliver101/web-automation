package br.com.submarino.pages;

import br.com.submarino.driver.Driver;
import org.openqa.selenium.WebElement;

public class SubmarinoPage {
    private final Driver driver;

    public SubmarinoPage(Driver driver) {
        this.driver = driver;
    }


    public WebElement getSearchButton(){return driver.findElementByXpath("//*[@id=\"h_search-btn\"]"); }
    public WebElement getSearchBar(){
        return driver.findElementById("h_search-input");
    }

    private WebElement searchBar;

}

package br.com.submarino.pages;

import br.com.submarino.driver.Driver;
import org.openqa.selenium.WebElement;

public class CommonPage {
    private final Driver driver;

    public CommonPage(Driver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBar() {
        return driver.findElementById("h_search-input");
    }

    private WebElement searchBar;

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    private By searchTextBox = By.id("SearchBarMinimal__input");

    private By searchResult = By.xpath("//p[contains(text(), 'Showing results for')]");


    public String searchForProduct(String product){
        driver.findElement(searchTextBox).sendKeys(product);
        return driver.findElement(searchResult).getText();
    }


}

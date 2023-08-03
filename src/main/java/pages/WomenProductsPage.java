package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WomenProductsPage {
    public WomenProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By womenProducts = By.xpath("//p[text()='Women']");
    private By everyDay = By.xpath("//p[text()='Everyday Sneakers']");

    private By everyDayAssertionMessage = By.xpath("//h1[text()='Everyday Sneakers']");

    public String navigateToWomenProducts(){
        driver.findElement(womenProducts).click();
        driver.findElement(everyDay).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(everyDayAssertionMessage));
        return driver.findElement(everyDayAssertionMessage).getText();
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KidsProductsPage {
    private WebDriver driver;
    public KidsProductsPage(WebDriver driver){
        this.driver = driver;
    }
    private By kidsProductsButton = By.xpath("//p[text()='Kids']");
    private By everydayProducts = By.xpath("//p[text()='Everyday Sneakers']");
    private By everydayAssertionMessage = By.xpath("//h1[text()='Smallbirds Wool Runners - Little Kids']");



    public String navigateToKidsProducts(){
        driver.findElement(kidsProductsButton).click();
        driver.findElement(everydayProducts).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(everydayAssertionMessage));
        return driver.findElement(everydayAssertionMessage).getText();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {
    private WebDriver driver;
    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }

    private By selectedProduct = By.xpath("//div[1]/div/div/div/div/div/a/div[1]/div/img");
    private By sizeButton = By.xpath("//li[3]/button");
    private By addToCartButton = By.id("add-to-cart");
    private By addToCartAssertionMsg = By.linkText("Men's Sale");



    public void navigateToProduct(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(selectedProduct)));
        driver.findElement(selectedProduct).click();
    }


    public String addToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(sizeButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addToCartButton)));
        driver.findElement(addToCartButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver.findElement(addToCartAssertionMsg).getText();
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateCartPage {
    private WebDriver driver;
    public UpdateCartPage(WebDriver driver){
        this.driver = driver;
    }
    private By plusButton = By.xpath("//button[@class='jsx-250421924 NumberStepper__button NumberStepper__button--step-up']");
    private By plusAssertionMessage = By.xpath("//span[text()='2']");


    public String incrementProductInCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(plusButton)));
        driver.findElement(plusButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        return driver.findElement(plusAssertionMessage).getText();
    }

}

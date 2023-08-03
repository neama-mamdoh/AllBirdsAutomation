package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DeleteFromCartPage {

    private WebDriver driver;

    public DeleteFromCartPage(WebDriver driver){
        this.driver = driver;
    }

    private By deleteButton = By.xpath("//span[@class='jsx-4160761852 CloseIcon CloseIcon--hoverable']");
    private By deleteAssertionMessage = By.xpath("//p[@class='jsx-3554908711 jsx-3341288278 CartEmptyState__heading']");


    public void deleteProduct(){
        driver.findElement(deleteButton).click();
    }

    public String getDeleteProductAssertionMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        return driver.findElement(deleteAssertionMessage).getText();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private By signupAndloginButton = By.xpath("//nav/ul[2]/li[5]/div/a/div/img");
    private By searchButton = By.xpath("//div[@class='jsx-2022988330 Icon Icon--SEARCH_SKINNY']");

    public RegisterPage navigateToRegisterPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(signupAndloginButton).click();
        return new RegisterPage(driver);
    }

    public LoginPage navigateToLoginPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(signupAndloginButton).click();
        return new LoginPage(driver);
    }

    public SearchPage navigateToSearchPage(){
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }


}

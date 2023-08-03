package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegisterPage {
    private WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By email = By.id("Email");
    private By password = By.id("CreatePassword");
    private By confirmpassword = By.id("CustomerPasswordConfirmation");
    private By registerButton = By.xpath("//input[@value='Register']");
    private By assertionButton = By.xpath("//img[@class=' ls-is-cached Lazy--loaded']");
    private By assertRegisterMessage = By.xpath("//h3[@class='name']");
    private By logoutBtn = By.xpath("//a[@class='logout']");

    public void enterUserData(String firstName, String lastName, String email, String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(this.firstName).sendKeys(firstName);
        driver.findElement(this.lastName).sendKeys(lastName);
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(confirmpassword).sendKeys(password);
        driver.findElement(registerButton).click();
    }

    public String clickRegister(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(assertionButton).click();
        return driver.findElement(assertRegisterMessage).getText();
    }


    public void logout(){
        driver.findElement(logoutBtn).click();
    }

}

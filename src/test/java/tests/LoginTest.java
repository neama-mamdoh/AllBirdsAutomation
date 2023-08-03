package tests;

//import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import java.io.IOException;

public class LoginTest extends BaseTest {
    HomePage homePage;
    RegisterPage register;
    String currentTime = String.valueOf(System.currentTimeMillis());
    LoginPage login;
    @Test(priority = 1,dataProvider = "SignUpData")
    public void registerBeforeLogin(String firstName,String lastName,String email, String password) throws IOException {
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();
        register = new RegisterPage(driver);
        register.enterUserData(firstName, lastName, email+currentTime+"@gmail.com", password);
        String registerMsg=register.clickRegister();
        Assert.assertEquals(registerMsg, "NEAMA MAMDOH");
        register.logout();
    }

    @Test(priority = 2,dataProvider = "LoginData")
    public void Login(String email,String password) throws IOException {
        homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        login = new LoginPage(driver);
        login.enterLoginInformation(email+currentTime+"@gmail.com", password);
        String loginMsg=login.clickLogin();
        Assert.assertEquals(loginMsg,"NEAMA MAMDOH");
    }

    @DataProvider
    public Object [] [] SignUpData ()
    {
        Object [][] data = new Object [1][4];

        data [0][0] = "Neama";		data [0][1] = "Mamdoh";		data [0][2] = "neama";  data [0][3] = "123456";

        return data;
    }
    @DataProvider
    public Object [] [] LoginData ()
    {
        Object [][] data = new Object [1][2];

        data [0][0] = "neama";  data [0][1] = "123456";

        return data;
    }

}

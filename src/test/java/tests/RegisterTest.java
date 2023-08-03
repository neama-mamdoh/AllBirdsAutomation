package tests;

//import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import java.io.IOException;


public class RegisterTest extends BaseTest {
    HomePage homePage;
    RegisterPage register;

    String currentTime = String.valueOf(System.currentTimeMillis());
    @Test(dataProvider="SignUpData")
    public void Register(String firstName,String lastName,String email,String password) throws IOException {
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();
        register = new RegisterPage(driver);
        register.enterUserData(firstName, lastName, email+currentTime+"@gmail.com", password);
        String registermsg=register.clickRegister();
        Assert.assertEquals(registermsg, "NEAMA MAMDOH");
        register.logout();
    }

    @DataProvider
    public Object [] [] SignUpData ()
    {
        Object [][] data = new Object [1][4];

        data [0][0] = "Neama";		data [0][1] = "Mamdoh";		data [0][2] = "neama";  data [0][3] = "123456";

        return data;
    }

}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class DeleteFromCartTest extends BaseTest{

    HomePage homePage;
    SearchPage search;
    AddToCartPage add;
    DeleteFromCartPage delete;
    @Test(priority = 1)
    public void searchForProduct(){
        homePage = new HomePage(driver);
        homePage.navigateToSearchPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        search = new SearchPage(driver);
        String product= search.searchForProduct("shirts");
        Assert.assertEquals(product,"Showing results for shirts");
    }

    @Test(priority = 2)
    public void addToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        add = new AddToCartPage(driver);
        add.navigateToProduct();
        String result=add.addToCart();
        Assert.assertEquals(result,"Men's Sale");
    }

    @Test(priority = 3)
    public void deletFromCart(){
        delete = new DeleteFromCartPage(driver);
        delete.deleteProduct();
        Assert.assertEquals(delete.getDeleteProductAssertionMessage(),"Your Cart is Empty");

    }
}

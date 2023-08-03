package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WomenProductsPage;

public class WomenProductsTest extends BaseTest {
    WomenProductsPage women;

    @Test
    public void navigateToEveryDayMenProduct(){
        women = new WomenProductsPage(driver);
        String result=women.navigateToWomenProducts();
        Assert.assertEquals(result,"Everyday Sneakers");
    }
}

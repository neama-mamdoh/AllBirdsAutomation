package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenProductsPage;

public class MenProductsTest extends BaseTest {
    MenProductsPage men;

    @Test
    public void navigateToEveryDayMenProduct(){
        men = new MenProductsPage(driver);
        String result=men.navigateToMenProducts();
        Assert.assertEquals(result,"Everyday Sneakers");
    }

}

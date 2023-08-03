package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KidsProductsPage;

public class KidsProductsTest extends BaseTest {
    KidsProductsPage kids;

    @Test
    public void navigateToEveryDayKidsProduct(){
        kids = new KidsProductsPage(driver);
        String result=kids.navigateToKidsProducts();
        Assert.assertEquals(result,"Smallbirds Wool Runners - Little Kids");
    }
}

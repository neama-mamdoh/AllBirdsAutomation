package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.time.Duration;

public class SearchTest extends BaseTest {
    HomePage homePage;
    SearchPage search;

    @Test
    public void searchForProduct(){
        homePage = new HomePage(driver);
        homePage.navigateToSearchPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        search = new SearchPage(driver);
        String result=search.searchForProduct("shoes");
        Assert.assertEquals(result,"Showing results for shoe");

    }
}

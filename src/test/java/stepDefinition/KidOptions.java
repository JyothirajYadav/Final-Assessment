package stepDefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ViewAll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class KidOptions
{
    AndroidDriver driver;
    ViewAll all;

    @Given("Click on view all button")
    public void clickOnViewAllButton() throws MalformedURLException, InterruptedException {
        driver=CommonAction.OpenApplication(driver);
        Thread.sleep(4000);
        CommonAction.login(driver);
        Thread.sleep(3000);
    }
    @And("Select boy as gender and click filter button")
    public void selectBoyAsGenderAndClickFilterButton() throws Exception
    {
       all =new ViewAll(driver);
       all.scrollTillDeals();
        Thread.sleep(1000);
        all.scrollTillGendertab();
        all.setFiltersButton();
    }
    //@Test(priority = 5)
    @And("Apply filter and select the option")
    public void applyFilterAndSelectTheOption() throws Exception
    {
        all.setShoeCheckBox();
       // all.setSizeOption();
        all.setRatingOption();
       // all.setRatingOption();
        all.setDoneKidButton();
    }
}

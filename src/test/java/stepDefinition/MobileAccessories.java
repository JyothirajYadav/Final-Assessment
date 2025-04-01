package stepDefinition;

import Utils.ExtentManager;
import Utils.Generic;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AccountsTab;
import pages.BottomTab;
import pages.ElectronicsPage;
import pages.HomePage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileAccessories
{
    AndroidDriver driver;
    ElectronicsPage ecpage;


    @Given("open Mesho app")
    public void openMeshoApp() throws MalformedURLException, InterruptedException {
        driver=CommonAction.OpenApplication(driver);
        Thread.sleep(1900);
    }

    @When("Handle all the pop-ups")
    public void handleAllThePopUps() throws InterruptedException
    {
        CommonAction.login(driver);
    }


    @Given("Click on Categories bottom tab")
    public void clickOnCategoriesBottomTab() throws InterruptedException, MalformedURLException
    {

        Thread.sleep(3000);
    }

    @Given("Move to Electronics option add Click on ViewAll option")
    public void moveToElectronicsOptionAddClickOnViewAllOption() throws Exception
    {
        ecpage = new ElectronicsPage(driver);
        ecpage.setHomeKitchenTab();
        ecpage.setJewelleryTab();
        ecpage.setElectronicsOption();
        ecpage.setViewAllOption();
        ecpage.setFilter();
        ecpage.setColorOption();
        ecpage.setPriceOption();
        ecpage.setCategoryInFilterOption();
    }

    @Given("Click on Filter, apply all the filters and Click on Done button")
    public void clickOnFilterApplyAllTheFiltersAndClickOnDoneButton() throws InterruptedException
    {
        ecpage.setDoneButton();
        Thread.sleep(3000);
    }




}

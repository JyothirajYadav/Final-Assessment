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


public class LandOnHomePage
{
    BottomTab tab;
    AccountsTab accountsTab;
    HomePage page;
    AndroidDriver driver;
    ElectronicsPage ele;

    @Given("I open Mesho app")
    public void i_open_mesho_app() throws MalformedURLException, InterruptedException {
        driver=CommonAction.OpenApplication(driver);
        Thread.sleep(12000);
    }

   @When("Click on deny button")
    public void click_on_deny_button() throws InterruptedException {
        page = new HomePage(driver);
        page.setDenyButton();
        Thread.sleep(7000);
    }

    @When("Click on English language button")
    public void click_on_english_language_button() throws InterruptedException {
        page.setEnglishLanguageButton();
        Thread.sleep(9000);
    }

    @Then("Click on x icon")
    public void click_on_x_icon() throws InterruptedException, IOException {
        page.setCancelIcon();
        Thread.sleep(3000);
        ExtentManager.test.pass("Test ran successfully");
        Generic.Screenshot(driver);
        Thread.sleep(3000);
        ExtentManager.test.pass("Test case passed");
    }
    @Then("Close the app")
    public void close_the_app()
    {
        driver.quit();
    }
}

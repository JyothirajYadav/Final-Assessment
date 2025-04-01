package stepDefinition;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AccountsTab;
import pages.BottomTab;
import pages.HomePage;
import pages.Hooks;

import java.net.MalformedURLException;
import java.net.URL;

public class ChangeLanguage
{
    AndroidDriver driver;
    BottomTab tab;
    AccountsTab accountsTab;
    HomePage page;


    @Given("I land on Home page")
    public void i_land_on_home_page() throws MalformedURLException, InterruptedException
    {
        driver=CommonAction.OpenApplication(driver);
        page = new HomePage(driver);
        page.setDenyButton();Thread.sleep(3000);
        page.setEnglishLanguageButton();Thread.sleep(3000);
        page.setCancelIcon();Thread.sleep(3000);

    }
    @When("I click on Account Tab")
    public void i_click_on_account_tab() throws InterruptedException {
        tab = new BottomTab(driver);
        tab.setAccountButton();
        Thread.sleep(3000);
    }
    @When("I click on Change Language button")
    public void i_click_on_change_language_button() throws InterruptedException {
        accountsTab = new AccountsTab(driver);
        accountsTab.setChangeLanguageButton();
        Thread.sleep(2000);
    }

    @Then("I click on Kannada Button")
    public void i_click_on_kannada_button() throws InterruptedException {
       accountsTab.setKannadaButton();
       Thread.sleep(2000);
    }

    @Then("I Click on change language button")
    public void i_click_on_Change_language_button() throws InterruptedException {
       accountsTab.setChangeLanguageButton();
       Thread.sleep(2000);
    }

    @Then("I change language to english")
    public void i_change_language_to_english() throws InterruptedException {
      accountsTab.setEnglishButton();
      Thread.sleep(2000);
      CommonAction.tearDown(driver);
    }

}

package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BottomTab
{
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]")
    private WebElement homeButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Categories\"]")
    private WebElement categoriesButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Orders\"]")
    private WebElement ordersButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Help\"]")
    private WebElement helpButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Account\"]")
    private WebElement accountButton;
    //==============================================================
    public BottomTab(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //==================================================================
    public void setHomeButton()
    {
        homeButton.click();
    }
    public void setCategoriesButton()
    {
        categoriesButton.click();
    }
    public void setHelpButton()
    {
        helpButton.click();
    }
    public void setOrdersButton()
    {
        ordersButton.click();
    }
    public void setAccountButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12000));
        wait.until(ExpectedConditions.visibilityOf(accountButton)).click();
    }
}

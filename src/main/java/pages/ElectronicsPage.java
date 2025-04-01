package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage
{
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Electronics\"]")
    private WebElement ElectronicsOption;
    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.meesho.supply:id/category_parent\"])[14]")
    private WebElement ViewAllOption;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id=\"com.meesho.supply:id/filter_checkbox\" and @text=\"Spy Cameras\"]")
    private WebElement spyCamera;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Color\"])[1]")
    private WebElement colorOption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Filters\"]")
    private WebElement filter;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Black\"]")
    private WebElement blackColor;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Price\"])[1]")
    private WebElement priceOption;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"₹ 800 & Above\"]")
    private WebElement above800Price;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Mice\"]")
    private WebElement miceCheckBox;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Mobile Accessories\"]")
    private WebElement mobileAccessoriesCheckbox;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Category\"])[1]")
    private WebElement CategoryInFilterOption;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.meesho.supply:id/primary_cta\"]")
    private WebElement doneButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.meesho.supply:id/title\" and @text=\"Home & Kitchen \"]")
    private WebElement HomeKitchenTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.meesho.supply:id/title\" and @text=\"Jewellery & Accessories\"]")
    private WebElement jewelleryTab;


    //===========================================
    public ElectronicsPage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //===========================================
    public void setElectronicsOption() throws InterruptedException {
        //new Actions(driver).moveToElement(ElectronicsOption).click().perform(); Thread.sleep(3000);
       // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Electronics\"))"));
        ElectronicsOption.click();
        Thread.sleep(4000);
    }
    public void setViewAllOption() throws InterruptedException
    {
        ViewAllOption.click();
        Thread.sleep(3000);
    }
    public void setFilter() throws InterruptedException
    {
        filter.click();Thread.sleep(3000);
    }
    public void setColorOption() throws InterruptedException
    {
        colorOption.click();Thread.sleep(2000);
        blackColor.click();Thread.sleep(2000);
    }
    public void setPriceOption() throws InterruptedException
    {
        priceOption.click();Thread.sleep(2000);
        above800Price.click();Thread.sleep(2000);
    }
    public void setCategoryInFilterOption() throws InterruptedException
    {
        CategoryInFilterOption.click();Thread.sleep(2000);
       // miceCheckBox.click();Thread.sleep(1000);
        mobileAccessoriesCheckbox.click();Thread.sleep(2000);
    }
    public void setDoneButton()
    {
        doneButton.click();
    }
    public void setHomeKitchenTab() throws InterruptedException
    {
        HomeKitchenTab.click();Thread.sleep(3000);
    }
    public void setJewelleryTab() throws Exception{
        jewelleryTab.click();
        Thread.sleep(3000);
    }
}

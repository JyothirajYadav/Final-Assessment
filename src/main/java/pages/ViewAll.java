package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ViewAll
{
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = \"Daily Deals\"]")
    private WebElement dailyDealsText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Filters\"]")
    private WebElement filtersButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Gender\"]")
    private WebElement genderButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Boys\"]")
    private WebElement boyButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Done\"]")
    private WebElement doneButton;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Shoes\"]")
    private WebElement shoeCheckBox;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Size\"])[1]")
    private WebElement sizeOption;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"2-5 Years\"]")
    private WebElement sizeCheckBox;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Rating\"])[1]")
    private WebElement ratingOption;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"3.5 and above\"]\n")
    private WebElement rating3_5Checkbox;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Price\"])[1]")
    private WebElement priceOption;
    @AndroidFindBy(xpath = "(//android.widget.Button[@text=\"Done\"])[1]")
    private WebElement doneKidButton;


    //===============================
    public ViewAll(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //===============================

    public void scrollTillDeals() throws Exception
    {
        Thread.sleep(2000);
        //driver.findElements(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Gender\"))"));
        Thread.sleep(3000);
        dailyDealsText.click();
        Thread.sleep(3000);
    }
    public void scrollTillGendertab() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Gender\"))"));
        Thread.sleep(3000);
        genderButton.click();
        Thread.sleep(2000);
        boyButton.click();
        doneButton.click();
        Thread.sleep(2000);
    }
    public void setFiltersButton() throws InterruptedException {
        filtersButton.click();
        Thread.sleep(2000);
    }
    public void setShoeCheckBox()
    {
        shoeCheckBox.click();
    }
    public void setSizeOption() throws InterruptedException {
        sizeOption.click();Thread.sleep(2000);
        sizeCheckBox.click();Thread.sleep(2000);
    }
    public void setRatingOption() throws InterruptedException
    {
        ratingOption.click();Thread.sleep(2000);
        rating3_5Checkbox.click();
    }
    public void setDoneKidButton()
    {
        doneKidButton.click();
    }
}

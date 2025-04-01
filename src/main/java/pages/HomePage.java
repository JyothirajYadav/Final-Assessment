package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage
{
    public AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
    public WebElement whileUsingTheAppButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")
    private WebElement onlyThisTimeButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    private WebElement DenyButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ENGLISH\"]")
    private WebElement EnglishLanguageButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.meesho.supply:id/iv_icon\"]")
    private WebElement cancelIcon;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Categories\"]")
    private WebElement categoryTab;
    //=============================
    public HomePage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //===============
    public void setWhileUsingTheAppButton()
    {
        whileUsingTheAppButton.click();
    }
    public void setOnlyThisTimeButton()
    {
        onlyThisTimeButton.click();
    }
    public void setDenyButton() throws InterruptedException {
        DenyButton.click();
        Thread.sleep(3000);
    }
    public void setEnglishLanguageButton() throws InterruptedException {
        EnglishLanguageButton.click();
        Thread.sleep(3000);
    }
    public void setCancelIcon() throws InterruptedException {
        cancelIcon.click();
        Thread.sleep(3000);
    }
    public void setCategoryTab() throws InterruptedException {
        categoryTab.click();
        Thread.sleep(3000);
    }
}

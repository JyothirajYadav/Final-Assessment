package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccountsTab
{
    AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"change_language\"]")
    private WebElement changeLanguageButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"KANNADA\"]")
    private WebElement kannadaButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"HINDI\"]")
    private WebElement hindiButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TELUGU\"]")
    private WebElement teluguButton;
//    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"HINDI\"]")
//    private WebElement hindiButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"BENGALI\"]")
    private WebElement bengaliButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ENGLISH\"]")
    private WebElement englishButton;
//    @AndroidFindBy(xpath = "")


    //====================================
    public AccountsTab(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //=====================================
    public void setChangeLanguageButton()
    {
        changeLanguageButton.click();
    }
    public void setKannadaButton() { kannadaButton.click();}
    public void setHindiButton() { hindiButton.click();}
    public void setTeluguButton() { teluguButton.click();}
    public void setBengaliButton() { bengaliButton.click();}
    public void setEnglishButton() { englishButton.click();}
}

package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//MobileElement
public class Generic
{
    public static  void moveTillElement(WebElement element, AndroidDriver driver)
    {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }
    public static void ClickAndHold(AndroidDriver driver, WebElement element)
    {
        Actions action = new Actions(driver);
        action.clickAndHold(element).perform();
    }
    public static void select_By_VisibleText(WebElement element,String text)
    {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void deSelect(WebElement element,String text)
    {
        Select select = new Select(element);
        select.deselectByVisibleText(text);
    }
    public static void Screenshot(AndroidDriver driver) throws IOException {
        TakesScreenshot screenShot = (TakesScreenshot) driver;
        String date = new Date().toString().replace(":", "_").replace(" ","_");
        //date=date.replace(" ","_");
        File temp = screenShot.getScreenshotAs(OutputType.FILE);
        File path = new File("D:\\Training\\MeeshoApp\\src\\main\\java\\ScreeShots\\" + date + ".jpg");
        FileHandler.copy(temp,path);
    }
}

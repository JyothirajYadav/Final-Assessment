package stepDefinition;

import Utils.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class CommonAction
{
    public static AndroidDriver OpenApplication(AndroidDriver driver) throws MalformedURLException {
        ConfigReader config = new ConfigReader();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName",config.getPlatformName());
        caps.setCapability("platformVersion",config.getPlatformVersion());
        caps.setCapability("automationName",config.getAutomationName());
        caps.setCapability("deviceName",config.getDeviceName());
        caps.setCapability("appPackage",config.getAppPackage());
        caps.setCapability("appActivity",config.getAppActivity());
        driver = new AndroidDriver(new URL(config.getURL()),caps);
        System.out.println("Application is Launched");
        return driver;
    }
    public static void login(AndroidDriver driver) throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.setDenyButton();
        page.setEnglishLanguageButton();
        page.setCancelIcon();
        //page.setCategoryTab();
    }
    public static String screenShot(AndroidDriver driver) throws IOException {
        String date = new Date().toString().replace(" ","_").replace(":","_");
        TakesScreenshot screen = (TakesScreenshot) driver;
        File temporary = screen.getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\Training\\MeeshoApp\\src\\screenshots" + date + ".jpg");
        FileHandler.copy(temporary,destination);
        return destination.toString();
    }
    public static void tearDown(AndroidDriver driver)
    {
        driver.quit();

    }
}

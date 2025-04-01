package pages;
import Utils.ConfigReader;
import Utils.ExtentReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Hooks {
    public static AndroidDriver driver;
    public ExtentSparkReporter extentSparkReporter;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    @Before
    public void setUp() throws MalformedURLException
    {
        ExtentReader.getInstance();
    }

    @AfterStep(order = 1)
    public void addScreenshot(Scenario scenario) throws IOException
    {
        if (scenario.isFailed())
        {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot on failure");
            ExtentReader.getInstance().createTest(scenario.getName()).fail("Step failed: " + scenario.getName());
        } else
        {
            // Log success in the Extent report
            ExtentReader.getInstance().createTest(scenario.getName()).pass("Step passed: " + scenario.getName());
        }
    }
    @After
    public void tearDown()
    {
        ExtentReader.getInstance().flush();
    }
}

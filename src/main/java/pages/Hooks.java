package pages;
import Utils.ConfigReader;
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
        System.out.println("Opening th Application");
        extentSparkReporter = new ExtentSparkReporter("D:\\Training\\MeeshoApp\\src\\ExtentReports\\report.html");
        extentSparkReporter.config().setDocumentTitle("Appium Report");
        extentSparkReporter.config().setReportName("Meesho report");
        extentSparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Company Name", "Qualitrix Technologies");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Tester Name", "Max Verstappen");
    }
    @BeforeStep
    public void beforeStep(Scenario scenario)
    {
        extentTest = extentReports.createTest(scenario.getName());
    }

    @AfterStep(order = 1)
    public void addScreenshot(Scenario scenario) throws IOException
    {
        if (scenario.getStatus()==Status.PASSED)
        {
            extentTest.log(com.aventstack.extentreports.Status.PASS, MarkupHelper.createLabel(scenario.getName()+" is Passed", ExtentColor.GREEN));
        }
        else if (scenario.getStatus()==Status.FAILED)
        {
            extentTest.log(com.aventstack.extentreports.Status.PASS, MarkupHelper.createLabel(scenario.getName()+" is Failed", ExtentColor.RED));
            extentTest.addScreenCaptureFromPath(String.valueOf(driver));
        }
        else if(scenario.getStatus()==Status.SKIPPED)
        {
            extentTest.log(com.aventstack.extentreports.Status.PASS, MarkupHelper.createLabel(scenario.getName()+" is Skipped", ExtentColor.BLUE));
        }
    }
    @After
    public void tearDown()
    {
        System.out.println("Closing the application");
        extentReports.flush();

    }
}

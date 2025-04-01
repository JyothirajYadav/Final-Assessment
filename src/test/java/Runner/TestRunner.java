package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature",
        dryRun = false,
        tags="@MobileAccessories",
        glue = "stepDefinition",
        plugin = {"pretty",
                "html:test-output/cucumber-reports/html-report.html",
//                "junit:test-output/cucumber-reports/cucumber.xml",
//                "json:test-output/cucumber-reports/json-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                        }
                 )

public class TestRunner extends AbstractTestNGCucumberTests
{
}


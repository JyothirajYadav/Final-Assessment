package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature",
        dryRun = false,
        tags="@Kannada or @Bengali",
        glue = "stepDefinition"

                 )

public class TestRunner extends AbstractTestNGCucumberTests
{

}


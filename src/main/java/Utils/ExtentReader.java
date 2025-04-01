package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ExtentReader
{
    public static ExtentReports extentReports;

    public static ExtentReports getInstance() {
        if (extentReports == null) {
            extentReports = new ExtentReports();
            loadConfig();
        }
        return extentReports;
    }
    private static void loadConfig()
    {
        {
            Properties properties = new Properties();
            try {
                FileInputStream fis = new FileInputStream("src/test/resources/extent.properties");
                properties.load(fis);

                String reportTitle = properties.getProperty("report.title");
                String reportName = properties.getProperty("report.name");
                String outputDirectory = properties.getProperty("report.output.directory");

                ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(outputDirectory + "/report.html");
                htmlReporter.config().setDocumentTitle(reportTitle);
                htmlReporter.config().setReportName(reportName);
                htmlReporter.config().setTheme(Theme.valueOf(properties.getProperty("theme").toUpperCase()));

                extentReports.attachReporter(htmlReporter);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

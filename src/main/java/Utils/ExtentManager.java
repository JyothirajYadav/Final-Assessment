package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentTest test;
    public static String fileName="D:\\Training\\MeeshoApp\\src\\ExtentReports.html";
    public static ExtentReports createInstance( String fileName) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    public static void flush() {
        extent.flush();
    }
}

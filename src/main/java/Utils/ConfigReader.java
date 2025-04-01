package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    Properties properties;
    public static String propertyFilePath = "D:\\Training\\MeeshoApp\\src\\main\\java\\Configuration.properties";

    public ConfigReader()
    {
        FileReader fileReader;
        properties = new Properties();
        try
        {
            fileReader = new FileReader(propertyFilePath);
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException("Configuration.properties not found at "+ propertyFilePath);
        }
    }
    public String getPlatformName()
    {
        String platFormName= properties.getProperty("platformFame");
        if(platFormName!=null)
            return platFormName;
        else
            throw new RuntimeException("Platform Name not specified in the Configuration.properties file.");
    }
    public String getPlatformVersion()
    {
        String platformVersion= properties.getProperty("platformVersion");
        if(platformVersion!=null)
            return platformVersion;
        else
            throw new RuntimeException("Platform Version not specified in the Configuration.properties file");
    }
    public String getAutomationName()
    {
        String automationName = properties.getProperty("automationName");
        if(automationName!=null)
            return automationName;
        else
            throw new RuntimeException("Automation Name not specified in the Configuration.properties file");
    }
    public String getDeviceName()
    {
        String deviceName = properties.getProperty("deviceName");
        if(deviceName!=null)
            return deviceName;
        else
            throw new RuntimeException("Device name not specified in the Configuration.properties file");
    }
    public String getAppPackage()
    {
        String appPackage = properties.getProperty("appPackage");
        if(appPackage!=null)
            return appPackage;
        else
            throw new RuntimeException("App package not specified in the Configuration.properties file");
    }
    public String getAppActivity()
    {
        String appActivity = properties.getProperty("appActivity");
        if(appActivity!=null)
            return appActivity;
        else
            throw new RuntimeException("App package not specified in the Configuration.properties file");
    }
    public String getURL()
    {
        String url = properties.getProperty("URL");
        if(url!=null)
            return url;
        else
            throw new RuntimeException("App package not specified in the Configuration.properties file");
    }
}

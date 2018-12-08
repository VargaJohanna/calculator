package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import org.junit.runner.RunWith;
import sharedMethods.DriverMethods;
import utils.AndroidDriverFactory;
import utils.DriverConfiguration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BeforeAfterScenario {
    private DriverMethods driverMethods;
    public BeforeAfterScenario(DriverMethods driverMethods) {
        this.driverMethods = driverMethods;
    }
    @Before
    public void setupDriver() {
        AndroidDriverFactory driverFactory = new AndroidDriverFactory();
        DriverConfiguration configuration = new DriverConfiguration();
        File apk = new File("src/test/java/apk/assignment1.apk");
        configuration.setDesiredCapabilities(
                apk,
                "Android",
                "Moto G5 Plus",
                "8.1.0",
                "UiAutomator2");
        configuration.setAppiumAddress("http://127.0.0.1:4723/wd/hub");
        driverMethods.setDriver(driverFactory.createAndroidDriver(configuration));
    }

    @After
    public void tearDown() {
        if(driverMethods.getDriver() != null) {
            driverMethods.getDriver().quit();
        }
    }
}

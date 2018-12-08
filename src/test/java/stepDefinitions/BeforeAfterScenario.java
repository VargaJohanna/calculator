package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import sharedMethods.DriverMethods;
import utils.AndroidDriverFactory;
import utils.DriverConfiguration;

import java.io.File;

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
                "*",
                "8",
                "UiAutomator2");
        configuration.setAppiumAddress("http://127.0.0.1:4723/wd/hub");
        driverMethods.setDriver(driverFactory.createAndroidDriver(configuration));
    }

    @After
    public void tearDown() {
        if (driverMethods.getDriver() != null) {
            driverMethods.getDriver().quit();
        }
    }
}

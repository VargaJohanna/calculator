package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import sharedMethods.DriverMethods;
import utils.AndroidDriverFactory;
import utils.DriverConfiguration;
import utils.DriverFactory;
import utils.TestConfiguration;

import java.io.File;

public class BeforeAfterScenario {
    private DriverMethods driverMethods;

    public BeforeAfterScenario(DriverMethods driverMethods) {
        this.driverMethods = driverMethods;
    }

    @Before
    public void setupDriver() {
        DriverFactory driverFactory = new AndroidDriverFactory();
        DriverConfiguration configuration = new DriverConfiguration();
        File apk = new File("src/test/java/apk/assignment1.apk");
        configuration.setDesiredCapabilities(
                apk,
                TestConfiguration.platformName,
                TestConfiguration.deviceName,
                TestConfiguration.platformVersion,
                TestConfiguration.automationName);
        configuration.setAppiumAddress("http://127.0.0.1:4723/wd/hub");
        driverMethods.setDriver(driverFactory.createDriver(configuration));
    }

    @After
    public void tearDown() {
        if (driverMethods.getDriver() != null) {
            driverMethods.getDriver().quit();
        }
    }
}

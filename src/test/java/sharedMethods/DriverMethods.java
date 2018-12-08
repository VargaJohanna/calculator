package sharedMethods;

import io.appium.java_client.AppiumDriver;
import pageObjects.Buttons;
import utils.StringUtils;

import static org.testng.Assert.fail;

public class DriverMethods {
    private AppiumDriver driver;

    public AppiumDriver getDriver() {
        return driver;
    }

    public void setDriver(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterNumber(String string) {
        if (StringUtils.isEmpty(string)) {
            throw new IllegalStateException("Input value can't be empty.");
        }

        for (char c : string.toCharArray()) {
            if (Buttons.buttonSelectors.containsKey(String.valueOf(c))) {
                driver.findElement(Buttons.buttonSelectors.get(String.valueOf(c))).click();
            } else {
                fail("The provided character was not found on the calculator");
            }
        }
    }
}

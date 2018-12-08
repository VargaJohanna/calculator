package sharedMethods;

import io.appium.java_client.AppiumDriver;
import pageObjects.Buttons;
import utils.StringUtils;

public class DriverMethods {
    private AppiumDriver driver;

    public AppiumDriver getDriver() {
        return driver;
    }

    public void setDriver(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterNumber(String string) {
        if(StringUtils.isEmpty(string)) {
            throw new IllegalStateException("Input value can't be empty.");
        }

        for(char c : string.toCharArray()) {
            driver.findElement(Buttons.buttonSelectors.get(String.valueOf(c))).click();
        }
    }
}

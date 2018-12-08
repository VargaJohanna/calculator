package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverFactory {
    public AppiumDriver createAndroidDriver(DriverConfiguration driverConfiguration) {
        return new AndroidDriver(driverConfiguration.getAppiumAddress(), driverConfiguration.getDesiredCapabilities());
    }
}

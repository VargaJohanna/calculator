package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverFactory implements DriverFactory {
    @Override
    public AppiumDriver createDriver(DriverConfiguration driverConfiguration) {
        return new AndroidDriver(driverConfiguration.getAppiumAddress(), driverConfiguration.getDesiredCapabilities());
    }
}

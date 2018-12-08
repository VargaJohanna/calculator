package utils;

import io.appium.java_client.AppiumDriver;

/**
 * DriverFactory is implemented by classes that creates different drivers like Android or iOS.
 * For this exercise only the Android driver is created.
 */
public interface DriverFactory {
    AppiumDriver createDriver(DriverConfiguration driverConfiguration);
}

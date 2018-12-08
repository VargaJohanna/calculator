package utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverConfiguration {
    private URL appiumAddress;
    private DesiredCapabilities desiredCapabilities;

    public URL getAppiumAddress() {
        return appiumAddress;
    }

    public void setAppiumAddress(String appiumAddress) {
        try {
            this.appiumAddress = new URL(appiumAddress);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public DesiredCapabilities getDesiredCapabilities() {
        return desiredCapabilities;
    }

    public void setDesiredCapabilities(File apk, String platformName, String deviceName, String platformVersion, String automationName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        this.desiredCapabilities = capabilities;
    }
}

package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import pageObjects.Buttons;
import sharedMethods.DriverMethods;

public class OperationsSteps implements En {
    public OperationsSteps (DriverMethods driverMethods) {
        Given("^(?:I enter number|I press button) \"([^\"]*)\"$", (String number) -> {
            driverMethods.enterNumber(number);
        });

        Then("^the output is \"([^\"]*)\"$", (String result) -> {
            String output = driverMethods.getDriver().findElement(Buttons.outputField).getText();
            Assert.assertTrue(output.equals(result));
        });


    }
}

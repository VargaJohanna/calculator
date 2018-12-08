package stepDefinitions;

import cucumber.api.java8.En;
import pageObjects.Buttons;
import sharedMethods.DriverMethods;
import utils.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class OperationsSteps implements En {
    public OperationsSteps (DriverMethods driverMethods) {
        Given("^I press button \"([^\"]*)\"$", (String input) -> {
            driverMethods.enterNumber(input);
            String output = driverMethods.getDriver().findElement(Buttons.outputField).getText();
        });

        Given("^I (?:enter number|enter) \"([^\"]*)\"$", (String input) -> {
            driverMethods.enterNumber(input);
            String output = driverMethods.getDriver().findElement(Buttons.outputField).getText();
            assertThat(output, equalTo(input));
        });

        Then("^the output is \"([^\"]*)\"$", (String result) -> {
            String output = driverMethods.getDriver().findElement(Buttons.outputField).getText();
            assertThat(output, equalTo(result));
        });

        Then("^the field should be empty$", () -> {
            String output = driverMethods.getDriver().findElement(Buttons.outputField).getText();
            assertThat(StringUtils.isEmpty(output), is(true));
        });

        Given("^I enter alphabetic characters$", () -> {
            driverMethods.getDriver().findElement(Buttons.outputField).sendKeys("string");
        });
    }
}

Feature: Execute basic operations

  Scenario: Sum two numbers
    Given I enter input "655001"
    And I press button "+"
    And I enter input "12000"
    When I press button "="
    Then the output is "667001.0"

  Scenario: Subtract numbers where the result is positive
    Given I enter input "999999.98"
    And I press button "-"
    And I enter input "999.01"
    When I press button "="
    Then the output is "999001.0"

  Scenario: Subtract numbers where the result is negative
    Given I enter input "70"
    And I press button "-"
    And I enter input "782000"
    When I press button "="
    Then the output is "-781930.0"

  Scenario: Divide two numbers
    Given I enter input "10000"
    And I press button "/"
    And I enter input "3"
    When I press button "="
    Then the output is "3333.3333"

  Scenario: Multiply two numbers
    Given I enter input "987654"
    And I press button "*"
    And I enter input "3210"
    When I press button "="
    Then the output is "3.17036928E9"

  Scenario: Dividing by null should not be allowed
    Given I enter input "1"
    And I press button "/"
    And I enter number "0"
    When I press button "="
    Then the output is "Infinity"

  @regression
  Scenario: Entering letters should not be allowed
    Given I enter input "string"
    Then the field should be empty

  Scenario: Clear button should clear the input field
    Given I enter input "101010"
    And I press button "C"
    Then the field should be empty

    #Pressing the buttons is slower in Appium then sending the input to the field.
    # To make sure that all the buttons are still functioning I added a test that clicks all of them:
  Scenario: All number buttons should be clickable
    Given I enter number "1234567890.01"
    Then the output is "1234567890.01"

  @regression
  Scenario: App should not crash when operation buttons are used on empty field
    Given I press button "="
    Then the field should be empty
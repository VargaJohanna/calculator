Feature: Execute basic operations

  Scenario: Sum two integer numbers
    Given I enter number "20"
    And I press button "+"
    And I enter number "3"
    When I press button "="
    Then the output is "23.0"

  Scenario: Sum two decimal numbers
    Given I enter number "20.56"
    And I press button "+"
    And I enter number "3.98"
    When I press button "="
    Then the output is "24.539999"

  Scenario: Subtract numbers where the result is positive
    Given I enter number "564"
    And I press button "-"
    And I enter number "125"
    When I press button "="
    Then the output is "439.0"

  Scenario: Subtract numbers where the result is negative
    Given I enter number "69"
    And I press button "-"
    And I enter number "782"
    When I press button "="
    Then the output is "-713.0"

  Scenario: Divide two numbers
    Given I enter number "4"
    And I press button "/"
    And I enter number "3"
    When I press button "="
    Then the output is "1.3333334"

  Scenario: Multiply two numbers
    Given I enter number "3"
    And I press button "*"
    And I enter number "9"
    When I press button "="
    Then the output is "27"

  Scenario: Divide by null should not be allowed
  Scenario: Tapping the input field should not open the device keyboard


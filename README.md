# calculator
Appium tests for an android calculator

## How to run the tests:
1. Checkout the repository

2. Ensure that the followings are installed on your machine:
    - Gradle: https://docs.gradle.org/current/userguide/installation.html (Please check if the prerequisites are met)
    - Appium: http://appium.io/docs/en/about-appium/getting-started/

3. Start running the appium server on host 127.0.0.1. If you’re using terminal: “appium -a 127.0.0.1”

4. Connect an android device or launch an emulator. 

5. If the Android version of the device is not 8, then please edit the “utils/TestConfiguration.java” file and change the “platformVersion” field in line 6.

6. Open Terminal and navigate to the directory path where build.gradle file is located in the repo
(e.g. C:\Users\<name>\IdeaProjects\calculator>,

7. Enter the following commands:
      On Windows enter “gradle runTests”.
      On Mac enter: “./gradlew runTests”.
   And the tests should start running
   
8. Alternatively the project can be opened by IntelliJ and run the tests by the “RunCucumberTest.java” file.
   Or trigger tests by right clicking on the scenarios in the “Operations.feature” file and selecting the run scenario option

## About the code
The suite lives within the src/test package. 
The src/test/java/utils package contains all the configurations.
The DriverMethods class (src/test/java/sharedMethods/) will be injected to any class that needs to call the driver.
The steps are in: src/test/java/stepDefinitions/ 
The tests are in: src/test/resources/

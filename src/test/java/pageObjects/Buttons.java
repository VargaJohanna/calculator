package pageObjects;

import org.openqa.selenium.By;
import sharedMethods.DriverMethods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Buttons {
    public static final By outputField = By.id("edt1");
    public static  final Map<String, By> buttonSelectors = Collections.unmodifiableMap(
            new HashMap<String, By>() {{
                put("1", By.id("button1"));
                put("2", By.id("button2"));
                put("3", By.id("button3"));
                put("4", By.id("button4"));
                put("5", By.id("button5"));
                put("6", By.id("button6"));
                put("7", By.id("button7"));
                put("8", By.id("button8"));
                put("9", By.id("button9"));
                put("0", By.id("button0"));
                put("=", By.id("buttoneql"));
                put(".", By.id("button10"));
                put("C", By.id("buttonC"));
                put("+", By.id("buttonadd"));
                put("-", By.id("buttonsub"));
                put("*", By.id("buttonmul"));
                put("/", By.id("buttondiv"));
            }}
    );

}

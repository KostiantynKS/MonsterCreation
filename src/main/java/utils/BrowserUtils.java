package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Random;

public class BrowserUtils {

    public static int getElementCount(WebDriver driver, By locator) {
        List elements = driver.findElements(locator);
        return elements.size();
    }
    public static String generateRandomNumber() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100) + 1);       // Convert int to String
    }


}
